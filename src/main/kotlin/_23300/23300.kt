package _23300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val back = ArrayDeque<Int>()
    val front = ArrayDeque<Int>()
    var current = 0
    for (i in 1..q) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "B" -> {
                if (back.isEmpty()) continue
                else {
                    front.addFirst(current)
                    current = back.removeLast()
                }
            }
            "F" -> {
                if (front.isEmpty()) continue
                else {
                    back.addLast(current)
                    current = front.removeFirst()
                }
            }
            "A" -> {
                front.clear()
                if (current != 0) back.addLast(current)
                current = st.nextToken().toInt()
            }
            "C" -> {
                var j = 1
                while (j < back.size) {
                    if (back[j - 1] == back[j]) {
                        back.removeAt(j--)
                    }
                    j++
                }
            }
        }
    }
    bw.write("$current\n")
    bw.write("${back.takeIf { it.isNotEmpty() }?.reversed()?.joinToString(" ") ?: -1}\n")
    bw.write("${front.takeIf { it.isNotEmpty() }?.joinToString(" ") ?: -1}")
    bw.close()
}