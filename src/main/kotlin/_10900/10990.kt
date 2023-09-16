package _10900

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    for (i in 1..n) {
        write("${" ".repeat(n - i)}*")
        if (i > 1) write(" ".repeat(2 * i - 3))
        if (i > 1) write("*")
        newLine()
    }
    close()
}