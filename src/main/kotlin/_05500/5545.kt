package _05500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (doughPrice, toppingPrice) = readLine().split(' ').map { it.toInt() }
    val doughCalory = readLine().toDouble()
    val toppingCalories = DoubleArray(n) { readLine().toDouble() }.apply { sortDescending() }
    var calory = doughCalory
    var price = doughPrice
    var best = calory / price
    toppingCalories.forEach {
        calory += it
        price += toppingPrice
        val current = calory / price
        if (current < best) return@with println(best.toInt())
        best = current
    }
    println(best.toInt())
}