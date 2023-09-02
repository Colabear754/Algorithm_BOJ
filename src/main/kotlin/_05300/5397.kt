package _05300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val left = ArrayDeque<Char>()
        val right = ArrayDeque<Char>()
        readLine().forEach {
            when (it) {
                '<' -> if (left.isNotEmpty()) right.addFirst(left.removeLast())
                '>' -> if (right.isNotEmpty()) left.addLast(right.removeFirst())
                '-' -> if (left.isNotEmpty()) left.removeLast()
                else -> left.addLast(it)
            }
        }
        bw.write("${left.joinToString("")}${right.joinToString("")}\n")
    }
    bw.close()
}