package _10900

fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    for (i in 1..n) {
        append(" ".repeat(n - i))
        if (i == 1 || i == n) append("*".repeat(2 * i - 1))
        else append("*").append(" ".repeat(2 * i - 3)).append("*")
        append('\n')
    }
    println(this)
}