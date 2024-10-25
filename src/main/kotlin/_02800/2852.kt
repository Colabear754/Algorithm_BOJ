package _02800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val team1 = Team()
    val team2 = Team()
    repeat(n) {
        val (team, time) = StringTokenizer(readLine()).run { nextToken() to StringTokenizer(nextToken(), ":").run { nextToken().toInt() * 60 + nextToken().toInt() } }
        when (team) {
            "1" -> {
                if (team1.score == team2.score) team1.lastTime = time
                if (team1.score == team2.score - 1) team2.time += time - team2.lastTime
                team1.score++
            }
            "2" -> {
                if (team2.score == team1.score) team2.lastTime = time
                if (team2.score == team1.score - 1) team1.time += time - team1.lastTime
                team2.score++
            }
        }
    }
    when {
        team1.score > team2.score -> team1.time += 2880 - team1.lastTime
        team1.score < team2.score -> team2.time += 2880 - team2.lastTime
    }
    println("${team1.timeToString()}\n${team2.timeToString()}")
}

private class Team(var score: Int, var time: Int, var lastTime: Int) {
    constructor() : this(0, 0, 0)
    fun timeToString() = String.format("%02d:%02d", time / 60, time % 60)
}