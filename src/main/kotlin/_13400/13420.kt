package _13400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val (a, operator, b, _, result) = Array(5) { nextToken() }
            when (operator) {
                "+" -> bw.write("${if (a.toLong() + b.toLong() == result.toLong()) "correct" else "wrong answer"}\n")
                "-" -> bw.write("${if (a.toLong() - b.toLong() == result.toLong()) "correct" else "wrong answer"}\n")
                "*" -> bw.write("${if (a.toLong() * b.toLong() == result.toLong()) "correct" else "wrong answer"}\n")
                "/" -> bw.write("${if (a.toLong() / b.toLong() == result.toLong()) "correct" else "wrong answer"}\n")
            }
        }
    }
    bw.close()
}