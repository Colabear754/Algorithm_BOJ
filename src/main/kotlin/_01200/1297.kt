package _01200

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (d, h, w) = br.readLine().split(" ").map { it.toDouble() }
    val x = sqrt(d.pow(2) / (h.pow(2) + w.pow(2)))  // 높이와 너비의 비율에 곱할 배율
    bw.write("${(h * x).toInt()} ${(w * x).toInt()}")
    bw.flush()
    br.close()
    bw.close()
}