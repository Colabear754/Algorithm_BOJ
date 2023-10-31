package _16400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val quest = IntArray(m) {
        var skill = 0
        StringTokenizer(readLine()).apply { repeat(k) { skill = skill or (1 shl (nextToken().toInt() - 1)) } }
        skill
    }
    var max = 0
    fun checkCase(i: Int, skillCount: Int, bit: Int) {
        if (skillCount == n) {
            var count = 0
            for (j in 0 until m) {
                if (quest[j] and bit == quest[j]) {
                    count++
                }
            }
            max = maxOf(max, count)
            return
        }
        for (j in i until 2 * n) {
            checkCase(j + 1, skillCount + 1, bit or (1 shl j))
        }
    }
    checkCase(0, 0, 0)
    println(max)
}