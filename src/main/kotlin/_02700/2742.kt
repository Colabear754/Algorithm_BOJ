package _02700

fun main() = with(System.out.bufferedWriter()) {
    for (i in readln().toInt() downTo 1) {
        write("$i\n")
    }
    close()
}