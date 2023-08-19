package _17900

fun main() = with(System.`in`.bufferedReader()) {
    val (h, x) = readLine().split(' ').map { it.toInt() }
    val arr = LongArray(h + 1)
    arr[0] = 1
    var snowball = 0L
    repeat(h) { i ->
        snowball += readLine().toInt() * ((arr[i] * x) % 1000000007).also { arr[i + 1] = it }
        snowball %= 1000000007
    }
    println(snowball)
}