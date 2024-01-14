package _29800

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val score = readLine().split(' ').map { it.toInt() }.toIntArray() + IntArray(5 - t)
    var result = 0
    result += if (score[0] > score[2]) (score[0] - score[2]) * 508 else (score[2] - score[0]) * 108
    result += if (score[1] > score[3]) (score[1] - score[3]) * 212 else (score[3] - score[1]) * 305
    result += score[4] * 707
    println(result * 4763)
}