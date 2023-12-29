package _17100

fun main() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(' ').map { it.toInt() }
    var answer = n
    while (n >= m) {
        n /= m
        answer += n
    }
    println(answer)
}