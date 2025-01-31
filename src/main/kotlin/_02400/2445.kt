package _02400

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    for (i in 1..n) {
        write("*".repeat(i))
        write(" ".repeat(2 * (n - i)))
        write("*".repeat(i))
        newLine()
    }
    for (i in n - 1 downTo 1) {
        write("*".repeat(i))
        write(" ".repeat(2 * (n - i)))
        write("*".repeat(i))
        newLine()
    }
    close()
}