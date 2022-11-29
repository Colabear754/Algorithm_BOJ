package _11600

fun main() = with(System.out.bufferedWriter()) {
    var n = System.`in`.bufferedReader().readLine().toInt()
    var i = 2
    while (n > 1) {
        if (n % i == 0) {
            write("$i\n")
            n /= i
        } else {
            i++
        }
    }
    close()
}