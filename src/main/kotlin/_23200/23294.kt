package _23200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q, c) = readLine().split(' ').map { it.toInt() }
    val cache = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val back = ArrayDeque<Int>()
    val front = ArrayDeque<Int>()
    var cacheSize = 0
    var current = 0
    for (i in 1..q) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "B" -> {
                if (back.isNotEmpty()) {
                    front.addFirst(current)
                    current = back.removeLast()
                }
            }
            "F" -> {
                if (front.isNotEmpty()) {
                    back.addLast(current)
                    current = front.removeFirst()
                }
            }
            "A" -> {
                while (front.isNotEmpty()) cacheSize -= cache[front.removeFirst()]
                if (current != 0) back.addLast(current)
                current = st.nextToken().toInt()
                cacheSize += cache[current]
                while (cacheSize > c) cacheSize -= cache[back.removeFirst()]
            }
            "C" -> {
                var j = 1
                while (j < back.size) {
                    if (back[j - 1] == back[j]) cacheSize -= cache[back.removeAt(j--)]
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