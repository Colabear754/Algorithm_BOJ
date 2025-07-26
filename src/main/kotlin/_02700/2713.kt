package _02700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine(), " ", true).apply {
            val r = nextToken().toInt()
            nextToken()
            val c = nextToken().toInt()
            nextToken()
            val string = StringBuilder()
            while (hasMoreTokens()) string.append(nextToken())
            val secret = StringBuilder()
            for (c in string) secret.append((if (c == ' ') 0 else c - '@').toString(2).padStart(5, '0'))
            val array = Array(r) { CharArray(c) { '0' } }
            var index = 0
            var top = 0
            var bottom = array.lastIndex
            var left = 0
            var right = array[0].lastIndex
            while (top <= bottom && left <= right && index < secret.length) {
                for (j in left..right) {
                    if (index < secret.length) array[top][j] = secret[index++]
                }
                top++
                for (i in top..bottom) {
                    if (index < secret.length) array[i][right] = secret[index++]
                }
                right--
                for (j in right downTo left) {
                    if (top <= bottom && index < secret.length) array[bottom][j] = secret[index++]
                }
                bottom--
                for (i in bottom downTo top) {
                    if (left <= right && index < secret.length) array[i][left] = secret[index++]
                }
                left++
            }
            bw.write(array.joinToString("") { it.joinToString("") })
            bw.newLine()
        }
    }
    bw.close()
}