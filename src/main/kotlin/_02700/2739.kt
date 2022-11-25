package _02700

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    for (i in 1..9) {
        write("$n * $i = ${n * i}\n")
    }
    close()
}