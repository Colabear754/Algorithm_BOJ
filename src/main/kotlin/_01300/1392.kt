package _01300

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, q) = readln().split(" ").map { it.toInt() }
    val time = ArrayList<Int>() // 시간마다 연주하는 악보를 저장할 리스트
    for (i in 1..n) {
        val m = readln().toInt()
        repeat(m) {
            time.add(i)
        }
    }
    repeat(q) {
        bw.write("${time[readln().toInt()]}\n")
    }
    bw.flush()
    bw.close()
}