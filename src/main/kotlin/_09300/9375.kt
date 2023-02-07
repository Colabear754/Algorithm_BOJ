package _09300

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val clothes = HashMap<String, Int>()
        repeat(readLine().toInt()) {
            StringTokenizer(readLine()).apply {
                nextToken()
                nextToken().also {
                    clothes[it] = clothes[it]?.plus(1) ?: 1
                }
            }
        }
        var result = 1
        for ((key, value) in clothes) {
            result *= value + 1
        }
        bw.write("${result - 1}\n")
    }
    bw.close()
}