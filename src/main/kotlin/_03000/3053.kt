package _03000

fun main() = with(System.out.bufferedWriter()) {
    val r = System.`in`.bufferedReader().readLine().toInt()
    write("${r * r * Math.PI}\n")
    write("${2 * r * r}")
    close()
}