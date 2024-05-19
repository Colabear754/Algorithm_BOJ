package _13200

fun main() = with(System.`in`.bufferedReader()) {
    val now = readLine().split(':').map { it.toInt() }
    val time = readLine().split(':').map { it.toInt() }
    val nowSecond = now[0] * 3600 + now[1] * 60 + now[2]
    val timeSecond = time[0] * 3600 + time[1] * 60 + time[2]
    val result = timeSecond - nowSecond + if (timeSecond <= nowSecond) 24 * 3600 else 0
    println(String.format("%02d:%02d:%02d", result / 3600, result % 3600 / 60, result % 60))
}