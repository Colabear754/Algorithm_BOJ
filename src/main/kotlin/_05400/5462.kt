package _05400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t, p) = readLine().split(' ').map { it.toInt() }
    val participants = Array(n) { it to ArrayList<Int>() }
    val problems = IntArray(t)
    repeat(n) { i ->
        StringTokenizer(readLine()).apply {
            repeat(countTokens()) { j -> if (nextToken() == "1") participants[i].second.add(j) else problems[j]++ }
        }
    }
    val sortedParticipants = participants.map { (id, solved) -> Participant(id, solved.sumOf { problems[it] }, solved.size) }.sorted()
    val philip = sortedParticipants.indexOfFirst { it.id == p - 1 }
    println("${sortedParticipants[philip].score} ${philip + 1}")
}

private class Participant(val id: Int, val score: Int, val problems: Int) : Comparable<Participant> {
    override fun compareTo(other: Participant) = when {
        score != other.score -> other.score - score
        problems != other.problems -> other.problems - problems
        else -> id - other.id
    }
}