package _01900

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val words = Array(2) { readLine() }
    val charCnt = IntArray(26)
    for (c in words[0]) {
        charCnt[c - 'a']++
    }
    for (c in words[1]) {
        charCnt[c - 'a']--
    }
    for (i in charCnt.indices) {
        charCnt[i] = abs(charCnt[i])
    }
    println(charCnt.sum())
}