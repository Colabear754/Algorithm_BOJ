package _23800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var count = 0
    for (last in n - 1 downTo 1) {
        var max = 0
        var index = 0
        for (i in 0..last) {
            if (array[i] > max) {
                max = array[i]
                index = i
            }
        }
        if (index != last) {
            count++
            if (count == k) {
                println("${array[last]} ${array[index]}")
                return@with
            }
            array[index] = array[last].also { array[last] = array[index] }
        }
    }
    println(-1)
}