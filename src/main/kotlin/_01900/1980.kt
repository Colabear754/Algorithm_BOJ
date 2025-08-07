package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, t) = readLine().split(' ').map { it.toInt() }
    var minCoke = Int.MAX_VALUE
    var burger = -1
    var coke = 0
    for (tower in 0..(t / n)) {
        val remain = t - n * tower
        val bulgogi = remain / m
        val cokeTime = remain % m
        if (cokeTime < minCoke || (cokeTime == minCoke && tower + bulgogi > burger)) {
            minCoke = cokeTime
            burger = tower + bulgogi
            coke = cokeTime
        }
    }
    println("$burger $coke")
}