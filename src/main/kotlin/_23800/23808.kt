package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    val str1 = StringBuilder().append("@".repeat(n)).append("   ".repeat(n)).append("@".repeat(n)).toString()
    val str2 = "@@@@@".repeat(n)
    repeat(2 * n) { write("$str1\n") }
    repeat(n) { write("$str2\n") }
    repeat(n) { write("$str1\n") }
    repeat(n) { write("$str2\n") }
    close()
}