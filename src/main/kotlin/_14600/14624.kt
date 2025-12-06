package _14600

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    if (n and 1 == 0) return@with println("I LOVE CBNU")
    appendLine("*".repeat(n))
    val half = n / 2
    append(" ".repeat(half)).appendLine("*")
    for (i in 1..half) {
        append(" ".repeat(half - i)).append("*").append(" ".repeat(2 * i - 1)).appendLine("*")
    }
    close()
}