package _01000

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Scanner
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val n = sc.nextInt()

    for (i in 0 until n) {
        val x1 = sc.nextInt()
        val y1 = sc.nextInt()
        val r1 = sc.nextInt()
        val x2 = sc.nextInt()
        val y2 = sc.nextInt()
        val r2 = sc.nextInt()

        writer.write(calc(x1, y1, r1, x2, y2, r2).toString() + "\n")
    }
    writer.flush()
    writer.close()
}

fun calc(x1: Int, y1: Int, r1: Int, x2: Int, y2: Int, r2: Int): Int {
    val distance = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))
    val result = when {
        distance == 0.0 && r1 == r2 -> -1   // 두 원이 일치하는 경우
        distance > r1 + r2 || distance < abs(r1 - r2) || (distance == 0.0 && r1 != r2) -> 0 // 두 원이 만나지 않고 떨어져있거나 한 원 내부에 다른 원이 있는 경우
        distance == (r1 + r2).toDouble() || distance == abs(r1 - r2).toDouble() -> 1    // 두 원이 한 점에서 접하는 경우
        distance < r1 + r2 || distance > abs(r1 - r2) -> 2  // 두 원이 두 점에서 접하는 경우
        else -> 0
    }
    return result
}