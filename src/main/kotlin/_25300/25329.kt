package _25300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val callRecords = mutableMapOf<String, Int>()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val minutes = StringTokenizer(nextToken(), ":").run { nextToken().toInt() * 60 + nextToken().toInt() }
            val name = nextToken()
            callRecords[name] = minutes + (callRecords[name] ?: 0)
        }
    }
    println(callRecords.map { CallCost(it.key, it.value) }.sorted().joinToString("\n") { "${it.name} ${it.cost}" })
}

private class CallCost(val name: String, minutes: Int) : Comparable<CallCost> {
    val cost = 10 + if (minutes <= 100) 0 else ((minutes - 51) / 50) * 3
    override fun compareTo(other: CallCost) = if (this.cost == other.cost) this.name.compareTo(other.name) else other.cost - this.cost
}