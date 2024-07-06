package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val isbn = readLine()
    var sum = 0
    var index = 0
    for ((i, n) in isbn.withIndex()) {
        if (n == '*') {
            index = i
            continue
        }
        sum += (n - '0') * if (i and 1 == 0) 1 else 3
    }
    for (n in 0..9) {
        if ((sum + n * if (index and 1 == 0) 1 else 3) % 10 == 0) {
            println(n)
            break
        }
    }
}