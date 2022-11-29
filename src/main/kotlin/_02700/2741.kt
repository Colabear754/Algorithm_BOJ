package _02700

fun main() = with(System.out.bufferedWriter()) {
    repeat(readln().toInt()) {
        write("${it + 1}\n")
    }
    close()
}