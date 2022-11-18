package _01000

import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    for (i in 0 until n) {
        val input = readLine().split(" ").map { it.toInt() }
        bw.write("${calc(input)}\n")
    }
    bw.close()
}

fun calc(l: List<Int>): Int {
    val distance = sqrt((l[3] - l[0]).toDouble().pow(2) + (l[4] - l[1]).toDouble().pow(2))
    val result = when {
        distance == 0.0 && l[2] == l[5] -> -1   // 두 원이 일치하는 경우
        distance > l[2] + l[5] || distance < abs(l[2] - l[5]) || (distance == 0.0 && l[2] != l[5]) -> 0 // 두 원이 만나지 않고 떨어져있거나 한 원 내부에 다른 원이 있는 경우
        distance == (l[2] + l[5]).toDouble() || distance == abs(l[2] - l[5]).toDouble() -> 1    // 두 원이 한 점에서 접하는 경우
        distance < l[2] + l[5] || distance > abs(l[2] - l[5]) -> 2  // 두 원이 두 점에서 접하는 경우
        else -> 0
    }
    return result
}