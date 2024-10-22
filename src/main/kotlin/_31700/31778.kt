package _31700

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toInt() }
    val s = readLine().toCharArray()
    var left = 0
    var right = n - 1
    while (left < right && k > 0) {
        if (s[left] == 'P') {
            left++
            continue
        }
        if (s[right] == 'C') {
            right--
            continue
        }
        s[left] = 'P'
        s[right] = 'C'
        k--
        left++
        right--
    }
    var result = 0L
    var p = 0L
    for (c in s) {
        if (c == 'P') {
            p++
            continue
        }
        result += p * (p - 1) / 2
    }
    println(result)
}