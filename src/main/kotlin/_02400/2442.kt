package _02400

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    for (i in 1..n) {
        write(" ".repeat(n - i))
        write("*".repeat(i * 2 - 1))
        newLine()
    }
    close()
}