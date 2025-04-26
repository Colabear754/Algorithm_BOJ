package _02400

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(n) {
        write(" ".repeat(it))
        write("*".repeat(2 * (n - it) - 1))
        newLine()
    }
    close()
}