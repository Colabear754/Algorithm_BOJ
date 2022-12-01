package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0
    for (i in 666..Int.MAX_VALUE) {
        if (i.toString().contains("666")) cnt++
        if (cnt == n) {
            println(i)
            break
        }
    }
}