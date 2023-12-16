package _18800

fun main() = with(System.out.bufferedWriter()) {
    val (n, m) = readln().split(' ').map { it.toInt() }
    repeat(n) { i ->
        for (j in 1..<m) write("${i * m + j} ")
        write("${(i + 1) * m}\n")
    }
    close()
}