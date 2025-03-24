package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(5 * n) { write("${if (it in 0..<n) "@".repeat(5 * n) else "@".repeat(n)}\n") }
    close()
}