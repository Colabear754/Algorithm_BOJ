package _25200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (u, f) = readLine().split(' ').map { it.toInt() }
    val userGroup = HashMap<String, Set<String>>()
    repeat(u) {
        StringTokenizer(readLine()).apply {
            val user = nextToken()
            val group = HashSet<String>().apply { add(user) }
            if (hasMoreTokens()) StringTokenizer(nextToken(), ",").apply { while (hasMoreTokens()) group.add(nextToken()) }
            userGroup[user] = group
        }
    }
    val files = HashMap<String, File>()
    repeat(f) { _ ->
        StringTokenizer(readLine()).apply { files[nextToken()] = File(nextToken().run { IntArray(3) { get(it) - '0' } }, nextToken(), nextToken()) }
    }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val user = nextToken()
            val fileName = nextToken()
            val command = nextToken()
            val file = files[fileName]!!
            val mode = file.mode.let { if (file.owner == user) it[0] else if (userGroup[user]!!.contains(file.group)) it[1] else it[2] }
            val success = when (command) {
                "R" -> mode and 4 == 4
                "W" -> mode and 2 == 2
                "X" -> mode and 1 == 1
                else -> false
            }
            bw.write(if (success) "1\n" else "0\n")
        }
    }
    bw.close()
}

private class File(val mode: IntArray, val owner: String, val group: String)