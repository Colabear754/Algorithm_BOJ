package _10900

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    for (i in 1..2 * n) {
        for (j in 1..n) {
            if (i and 1 == 1) write(if (j and 1 == 1) "*" else " ")
            else write(if (j and 1 == 1) " " else "*")
        }
        newLine()
    }
    close()
}