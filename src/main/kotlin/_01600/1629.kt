package _01600

fun main() = with(System.`in`.bufferedReader()) {
    var (a, b, c) = readLine().split(' ').map { it.toLong() }
    var result = 1L
    while (b > 0) {
        if (b % 2 == 1L) result = (result * a) % c
        a = ((a % c) * (a % c)) % c
        b /= 2
    }
    print(result)
}