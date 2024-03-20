package _25900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val problems = StringTokenizer(readLine()).run { Array(n) { nextToken() } }
    val sortedProblems = problems.sortedWith(compareBy({ it[0].difficulty() }, { -it.substring(1).toInt() }))
    val trolled = ArrayList<String>()
    for (i in 0..<n) {
        if (problems[i] != sortedProblems[i]) {
            trolled.add(problems[i])
        }
    }
    println(if (trolled.isEmpty()) "OK" else "KO\n${trolled.sortedWith(compareBy({ it[0].difficulty() }, { -it.substring(1).toInt() })).joinToString(" ")}")
}

private fun Char.difficulty() = when (this) {
    'B' -> 1
    'S' -> 2
    'G' -> 3
    'P' -> 4
    else -> 5
}
