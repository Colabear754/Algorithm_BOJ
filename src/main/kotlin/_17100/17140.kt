package _17100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c, k) = readLine().split(' ').map { it.toInt() }
    var a = List(3) { StringTokenizer(readLine()).run { MutableList(3) { nextToken().toInt() } } }
    var time = 0
    var row = 3
    var column = 3
    while (time <= 100) {
        if (r - 1 < a.size && c - 1 < a[r - 1].size && a[r - 1][c - 1] == k) {
            println(time)
            return@with
        }
        val sortedA = mutableListOf<MutableList<Int>>()
        if (row >= column) {
            for (i in 0..<row) {
                val map = mutableMapOf<Int, Int>()
                for (j in a[i].indices) {
                    if (a[i][j] != 0) map[a[i][j]] = (map[a[i][j]] ?: 0) + 1
                }
                val list = map.toList().sortedWith(compareBy({ it.second }, { it.first }))
                    .fold(mutableListOf<Int>()) { acc, (num, count) -> acc.apply { add(num); add(count) } }
                sortedA.add(list)
                column = maxOf(column, list.size)
            }
            a = sortedA
            time++
            continue
        }
        for (i in 0..<column) {
            val map = mutableMapOf<Int, Int>()
            for (j in a.indices) {
                if (i < a[j].size && a[j][i] != 0) map[a[j][i]] = (map[a[j][i]] ?: 0) + 1
            }
            val list = map.toList().sortedWith(compareBy({ it.second }, { it.first }))
            var index = 0
            for ((num, count) in list) {
                sortedA.getOrNull(index++)?.add(num) ?: run { sortedA.add(MutableList(i) { 0 }.apply { add(num) }) }
                sortedA.getOrNull(index++)?.add(count) ?: run { sortedA.add(MutableList(i) { 0 }.apply { add(count) }) }
            }
            for (j in index..<sortedA.size) {
                sortedA[j].add(0)
            }
            row = maxOf(row, sortedA.size)
        }
        a = sortedA
        time++
    }
    println(-1)
}