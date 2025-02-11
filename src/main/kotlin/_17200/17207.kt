package _17200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val name = arrayOf("Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki")
    val a = Array(5) { StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } } }
    val b = Array(5) { StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } } }
    val work = IntArray(5)
    for (i in 0..<5) {
        for (j in 0..<5) {
            for (k in 0..<5) {
                work[i] += a[i][k] * b[k][j]
            }
        }
    }
    val min = work.min()
    val minIndices = work.indices.filter { work[it] == min }
    println(name[minIndices.last()])
}