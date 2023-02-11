package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, l, k) = readLine().split(' ').map { it.toInt() }
    val stars = ArrayList<IntArray>()
    repeat(k) { stars.add(StringTokenizer(readLine()).run { intArrayOf(nextToken().toInt(), nextToken().toInt()) }) }
    var blockedStar = Int.MIN_VALUE
    for (star1 in stars) {
        for (star2 in stars) {
            blockedStar = maxOf(blockedStar, run {
                var temp = 0
                for (s in stars) {
                    if (s[0] - star1[0] in 0..l && s[1] - star2[1] in 0..l) temp++
                }
                temp
            })
        }
    }
    println(k - blockedStar)
}