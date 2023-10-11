package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    val str1 = "${"@@@".repeat(n)}${" ".repeat(n)}${"@".repeat(n)}"
    val str2 = "${("@".repeat(n) + " ".repeat(n)).repeat(2)}${"@".repeat(n)}\n"
    val str3 = str1.reversed()
    repeat(n) { write("$str1\n") }
    repeat(n * 3) { write(str2) }
    repeat(n) { write("$str3\n") }
    close()
}