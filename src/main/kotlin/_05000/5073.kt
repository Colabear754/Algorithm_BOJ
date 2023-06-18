package _05000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0 0 0") {
        val triangle = StringTokenizer(input).run { IntArray(3) { nextToken().toInt() }.sorted() }
        bw.write(when {
            triangle[0] == triangle[1] && triangle[1] == triangle[2] -> "Equilateral\n"
            triangle[0] + triangle[1] <= triangle[2] -> "Invalid\n"
            triangle[0] == triangle[1] || triangle[1] == triangle[2] -> "Isosceles\n"
            else -> "Scalene\n"
        })
    }
    bw.close()
}