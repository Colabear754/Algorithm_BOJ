package _21900

import java.util.StringTokenizer
import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val difficulty = IntArray(100001)
    val algorithm = IntArray(100001)
    val problemsG = Array(101) { TreeSet<Problem>() }
    val problems = TreeSet<Problem>()
    fun StringTokenizer.addProblem() {
        val (p, l, g) = IntArray(3) { nextToken().toInt() }
        val problem = Problem(p, l)
        difficulty[p] = l
        algorithm[p] = g
        problemsG[g].add(problem)
        problems.add(problem)
    }
    repeat(readLine().toInt()) { StringTokenizer(readLine()).addProblem() }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "recommend" -> nextToken().toInt().also { bw.write(if (nextToken() == "1") "${problemsG[it].first()}\n" else "${problemsG[it].last()}\n") }
                "recommend2" -> bw.write(if (nextToken() == "1") "${problems.first()}\n" else "${problems.last()}\n")
                "recommend3" -> {
                    val x = nextToken()
                    val problem = Problem(0, nextToken().toInt())
                    bw.write(if (x == "1") "${problems.floor(problem) ?: -1}\n" else "${problems.ceiling(problem) ?: -1}\n")
                }
                "add" -> addProblem()
                "solved" -> {
                    val p = nextToken().toInt()
                    val problem = Problem(p, difficulty[p])
                    problemsG[algorithm[p]].remove(problem)
                    problems.remove(problem)
                }
            }
        }
    }
    bw.close()
}

private class Problem(val number: Int, val difficulty: Int) : Comparable<Problem> {
    override fun compareTo(other: Problem) = if (difficulty == other.difficulty) other.number - number else other.difficulty - difficulty
    override fun toString() = "$number"
}