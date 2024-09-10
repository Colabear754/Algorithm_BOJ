package _07500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val games = ArrayList<Game>()
    repeat(readLine().toInt()) {
        repeat(readLine().toInt()) {
            StringTokenizer(readLine()).run { games.add(Game(nextToken().toInt(), nextToken().toInt(), nextToken().toInt())) }
        }
        games.sort()
        var result = 0
        var current = 0
        for (i in 0..<games.size - 1) {
            if (games[i].start >= current) {
                result++
                current = games[i].end
            }
            if (games[i].day != games[i + 1].day) current = 0
        }
        if (games.last().start >= current) result++
        bw.write("Scenario #${it + 1}:\n$result\n\n")
        games.clear()
    }
    bw.close()
}

private class Game(val day: Int, val start: Int, val end: Int) : Comparable<Game> {
    override fun compareTo(other: Game) = when {
        this.day == other.day -> if (this.end == other.end) this.start - other.start else this.end - other.end
        else -> this.day - other.day
    }
}