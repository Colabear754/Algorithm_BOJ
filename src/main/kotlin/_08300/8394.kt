package _08300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 0) return@with println(1)
    println(arrayOf(intArrayOf(1, 1), intArrayOf(1, 0)).calculateFibonacci(n))
}

private fun Array<IntArray>.calculateFibonacci(n: Int): Int {
    var result = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
    var base = this
    var exp = n
    while (exp > 0) {
        if (exp and 1 == 1) {
            result *= base
        }
        base *= base
        exp /= 2
    }
    return result[0][0] % 10
}

private operator fun Array<IntArray>.times(other: Array<IntArray>): Array<IntArray> {
    return arrayOf(
        intArrayOf((this[0][0] * other[0][0] + this[0][1] * other[1][0]) % 10, (this[0][0] * other[0][1] + this[0][1] * other[1][1]) % 10),
        intArrayOf((this[1][0] * other[0][0] + this[1][1] * other[1][0]) % 10, (this[1][0] * other[0][1] + this[1][1] * other[1][1]) % 10)
    )
}