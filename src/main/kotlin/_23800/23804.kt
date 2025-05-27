package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(5 * n) { write("${"@".repeat(if (it in n..<4 * n) n else 5 * n)}\n") }
    close()
}