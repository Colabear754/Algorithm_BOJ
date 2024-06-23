package _09800

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var count = 0
    var block = 1
    while (n >= block) {
        count++
        n -= block
        block += count * 4
    }
    println(count)
}