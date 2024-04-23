package _02400

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(n) {
        repeat(n - it) { write("*") }
        newLine()
    }
    close()
}