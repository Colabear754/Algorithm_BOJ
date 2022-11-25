package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(' ').map { it.toInt() }
    val dice = IntArray(6)
    input.forEach {
        dice[6 - it]++
    }
    var max = 0
    dice.forEach {
        max = maxOf(max, it)
    }
    println(
        when (max) {
            3 -> (6 - dice.indexOf(max)) * 1000 + 10000
            2 -> (6 - dice.indexOf(max)) * 100 + 1000
            else -> (6 - dice.indexOf(max)) * 100
        }
    )
}