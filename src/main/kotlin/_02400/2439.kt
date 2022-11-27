package _02400

fun main() = with(System.out.bufferedWriter()) {
    val n = System.`in`.bufferedReader().readLine().toInt()
    repeat(n) {
        repeat(n - it - 1) {
            write(" ")
        }
        repeat(it + 1) {
            write("*")
        }
        write("\n")
    }
    close()
}