package _02400

fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    for (i in n downTo 1) {
        for (j in 1..n - i) {
            append(' ')
        }
        for (j in 1 until 2 * i) {
            append('*')
        }
        append('\n')
    }
    for (i in 2..n) {
        for (j in 1..n - i) {
            append(' ')
        }
        for (j in 1 until 2 * i) {
            append('*')
        }
        append('\n')
    }
    println(this)
}