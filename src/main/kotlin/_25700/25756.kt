package _25700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    readLine()
    var ignoreArmor = 0.0
    StringTokenizer(readLine()).apply {
        while (hasMoreTokens()) {
            ignoreArmor = 1 - (1 - ignoreArmor) * (1 - nextToken().toDouble() / 100)
            bw.write("${ignoreArmor * 100}\n")
        }
    }
    bw.close()
}