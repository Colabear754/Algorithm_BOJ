package _21600

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val fk = k % 10
    val f2k = k * 2 % 10
    var count = 0
    val result = StringBuilder()
    for (i in 1..n) {
        (i % 10).takeIf { it != fk && it != f2k }?.let {
            count++
            result.append(i).append(' ')
        }
    }
    println("$count\n$result")
}