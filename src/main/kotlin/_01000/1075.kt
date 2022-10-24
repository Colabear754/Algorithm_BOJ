package _01000

fun main() {
    var n = readln().toInt()
    val f = readln().toInt()
    n = n / 100 * 100
    for (i in 0 until 100) {
        if (n % f == 0) {
            break
        }
        n++
    }
    println(n.toString().substring(n.toString().length - 2))
}