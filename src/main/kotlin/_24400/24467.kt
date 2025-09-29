package _24400

fun main() = with(System.`in`.bufferedReader()) {
    var isBonus = false
    fun String.calcMovement(): Int {
        val result = count { it == '0' }.let { if (it == 0) 5 else it }
        if (result >= 4) isBonus = true
        return result
    }
    var current = 0
    repeat(10) {
        current = move(current, readLine().calcMovement())
        if (current in 21..100 || current in 112..200 || current > 206) {
            return@with println("WIN")
        }
        while (isBonus) {
            isBonus = false
            current = move(current, readLine().calcMovement())
            if (current in 21..100 || current in 112..200 || current > 206) {
                return@with println("WIN")
            }
        }
    }
    println("LOSE")
}

private fun move(start: Int, movement: Int) = when (start) {
    5 -> 100
    10 -> 200
    103 -> 203
    else -> start
} + movement