package _19600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val powers = LinkedHashSet<Int>()
    val titles = ArrayList<String>()
    repeat(n) {
        val (title, power) = StringTokenizer(readLine()).run { nextToken() to nextToken().toInt() }
        if (powers.add(power)) titles.add(title)
    }
    val powerList = powers.toList()
    repeat(m) {
        val index = powerList.binarySearch(readLine().toInt())
        bw.write(if (index >= 0) titles[index] else titles[-index - 1])
        bw.newLine()
    }
    bw.close()
}