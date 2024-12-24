package _04400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val gandalfArmy = intArrayOf(1, 2, 3, 3, 4, 10)
    val sauronArmy = intArrayOf(1, 2, 2, 2, 3, 5, 10)
    for (i in 1..readLine().toInt()) {
        val gandalfPower = StringTokenizer(readLine()).run { gandalfArmy.sumOf { it * nextToken().toInt() } }
        val sauronPower = StringTokenizer(readLine()).run { sauronArmy.sumOf { it * nextToken().toInt() } }
        when {
            gandalfPower > sauronPower -> bw.write("Battle $i: Good triumphs over Evil\n")
            gandalfPower < sauronPower -> bw.write("Battle $i: Evil eradicates all trace of Good\n")
            else -> bw.write("Battle $i: No victor on this battle field\n")
        }
    }
    bw.close()
}