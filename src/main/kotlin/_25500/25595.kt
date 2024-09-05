package _25500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var reginleif = 0
    val map = Array(n) { i -> StringTokenizer(readLine()).run { IntArray(n) { j -> nextToken().toInt().also {
        if (it == 2) reginleif = (i + j) and 1
    } } } }
    var oddRowRegion = 0
    var evenRowRegion = 0
    repeat(n) { i ->
        repeat(n) { j ->
            if (map[i][j] == 1) {
                if ((i + j) and 1 == 0) oddRowRegion++ else evenRowRegion++
            }
        }
    }
    println(if ((evenRowRegion == 0 && reginleif == 0) || (oddRowRegion == 0 && reginleif == 1)) "Lena" else "Kiriya")
}