package _10900

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    val star = CharArray(n) { '*' }
    repeat(n) { write("${if (it % 2 == 0) "" else " "}${star.joinToString(" ")}\n") }
    close()
}