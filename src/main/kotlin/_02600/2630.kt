package _02600

import java.util.StringTokenizer

private val n = readln().toInt()
private val paper = Array(n) { ByteArray(n) }
private var w = 0
private var b = 0

fun main() = with(System.`in`.bufferedReader()) {
    var st: StringTokenizer
    repeat(n) {
        st = StringTokenizer(readLine())
        paper[it] = ByteArray(n){ st.nextToken().toByte() }
    }
    cp(0, 0, n)
    println("$w\n$b")
}

private fun cp(x: Int, y: Int, size: Int) {
    val next = size / 2
    var cnt = 0
    for (i in x until x + size) {
        for (j in y until y + size) {
            cnt += if (paper[i][j] == 1.toByte()) 1 else 0
        }
    }
    when (cnt) {
        size * size -> {
            b++
            return
        }
        0 -> {
            w++
            return
        }
    }
    cp(x, y, next)
    cp(x + next, y, next)
    cp(x, y + next, next)
    cp(x + next, y + next, next)
}