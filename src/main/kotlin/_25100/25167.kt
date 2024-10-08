package _25100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, p) = readLine().split(' ').map { it.toInt() }
    val participants = StringTokenizer(readLine()).run { List(m) { nextToken() } }
    val solveLog = Array(n + 1) { HashMap<String, Problem>() }
    repeat(p) {
        val (problem, time, name, result) = StringTokenizer(readLine()).run { List(4) { nextToken() } }
        solveLog[problem.toInt()].getOrPut(name) { Problem() }.apply { if (result == "wrong") wrong(time) else solve(time) }
    }
    val scoreMap = HashMap<String, Int>()
    val solvedList = Array(n + 1) { ArrayList<Pair<String, Int>>() }
    for (i in 1..n) {
        for (name in participants) {
            val problem = solveLog[i][name]
            if (problem == null || problem.wrongTime == -1) {
                scoreMap[name] = (scoreMap[name] ?: 0) + m + 1
                continue
            }
            if (problem.solveTime == -1) {
                scoreMap[name] = (scoreMap[name] ?: 0) + m
                continue
            }
            solvedList[i].add(name to problem.solveTime - problem.wrongTime)
        }
        solvedList[i].sortWith(compareBy({ it.second }, { it.first }))
        var score = 0
        solvedList[i].forEach { (name, _) -> scoreMap[name] = (scoreMap[name] ?: 0) + ++score }
    }
    val result = scoreMap.toList().sortedWith(compareBy({ it.second }, { it.first }))
    println(result.joinToString("\n") { it.first })
}

private class Problem(var wrongTime: Int = -1, var solveTime: Int = -1) {
    fun wrong(time: String) = this.apply { if (wrongTime == -1 && solveTime == -1) wrongTime = time.calcTime }
    fun solve(time: String) = this.apply { if (solveTime == -1) solveTime = time.calcTime }
}

private val String.calcTime get() = StringTokenizer(this, ":").run { nextToken().toInt() * 60 + nextToken().toInt() }