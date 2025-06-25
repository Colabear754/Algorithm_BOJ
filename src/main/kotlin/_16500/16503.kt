package _16500

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(' ')
    val k1 = input[0].toInt()
    val k2 = input[2].toInt()
    val k3 = input[4].toInt()
    val result1 = calculate(calculate(k1, k2, input[1]), k3, input[3])
    val result2 = calculate(k1, calculate(k2, k3, input[3]), input[1])
    println("${minOf(result1, result2)}\n${maxOf(result1, result2)}")
}

private fun calculate(a: Int, b: Int, operator: String): Int = when (operator) {
    "+" -> a + b
    "-" -> a - b
    "*" -> a * b
    else -> a / b
}