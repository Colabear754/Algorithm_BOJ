package _16400

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val (n, r, c) = readLine().split(' ').map { it.toInt() }
        repeat(n) { i ->
            repeat(n) { j ->
                write(if (r - i and 1 == c - j and 1) "v" else ".")
            }
            newLine()
        }
        close()
    }
}