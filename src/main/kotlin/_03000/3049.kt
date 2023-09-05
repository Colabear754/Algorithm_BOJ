package _03000

fun main() = print(combination(readln().toInt()))

private fun combination(n: Int): Int {
    var temp = n
    var result = 1
    for (i in 1..4) {
        result *= temp--
        result /= i
    }
    return result
}