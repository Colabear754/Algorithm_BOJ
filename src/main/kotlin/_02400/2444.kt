package _02400

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    fun star(n: Int, i: Int) {
        for (j in 1..n - i) write(" ")
        for (j in 1 until 2 * i) write("*")
        write("\n")
    }
    for (i in 1..n) star(n, i)
    for (i in n - 1 downTo 1) star(n, i)
    close()
}