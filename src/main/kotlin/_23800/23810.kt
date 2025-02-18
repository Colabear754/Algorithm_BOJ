package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(n) { write("${"@".repeat(5 * n)}\n") }
    repeat(n) { write("${"@".repeat(n)}\n") }
    repeat(n) { write("${"@".repeat(5 * n)}\n") }
    repeat(2 * n) { write("${"@".repeat(n)}\n") }
    close()
}