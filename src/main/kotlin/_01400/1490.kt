package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()
    val digits = n.filter { it != '0' }.map { it - '0' }
    var lcm = digits[0]
    for (i in 1..digits.lastIndex) {
        lcm = lcm(lcm, digits[i])
    }
    val num = n.toInt()
    var checkSize = 1L
    while (true) {
        var temp = num * checkSize
        for (i in 0 until checkSize) {
            if (temp % lcm == 0L) {
                println(temp)
                return@with
            }
            temp++
        }
        checkSize *= 10
    }
}

fun lcm(a: Int, b: Int) = a * b / gcd(a, b)

fun gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)