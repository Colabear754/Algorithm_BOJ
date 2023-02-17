package _27300

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val problems = PriorityQueue<Problem> { o1, o2 -> if (o1.p == o2.p) o1.d - o2.d else o1.p - o2.p }
    repeat(n) {
        StringTokenizer(readLine()).apply {
            problems.add(Problem(nextToken().toInt(), nextToken().toInt(), nextToken().toInt(), nextToken().toInt()))
        }
    }
    var (hd, hp) = readLine().split(' ').map { it.toInt() }
    var ac = 0L
    var wa = 0L
    val unsolved = PriorityQueue<Problem> { o1, o2 -> if (o1.d == o2.d) o1.p - o2.p else o1.d - o2.d }
    while (problems.isNotEmpty()) {
        val problem = problems.poll()
        if (hd < problem.d) {
            unsolved.add(problem)
            continue
        }

        if (hp < problem.p) wa += problem.p - hp
        if (++ac == m.toLong()) {
            println(wa)
            return@with
        }
        hd++
        hp++
        while (unsolved.isNotEmpty() && unsolved.peek().d <= hd) problems.add(unsolved.poll())
    }
    println(-1)
}

class Problem(d: Int, p: Int, t: Int, e: Int) {
    val d = if (e == 1) d / 2 + d % 2 else d
    val p = if (t == 0) (if (e == 1) p / 2 else p) else 0
}