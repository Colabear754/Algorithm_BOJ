package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(4 * n) {
        write("@".repeat(n))
        newLine()
    }
    repeat(n) {
        write("@".repeat(5 * n))
        newLine()
    }
    close()
}