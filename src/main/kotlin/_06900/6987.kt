package _06900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(4) {
        val games = Array(15) { 0 to 0 }
        var index = 0
        for (i in 0..5) {
            for (j in i + 1..5) {
                games[index++] = i to j
            }
        }
        val leagueResult = StringTokenizer(readLine()).run { Array(6) { IntArray(3) { nextToken().toInt() } } }
        val winSum = leagueResult.sumOf { it[0] }
        val drawSum = leagueResult.sumOf { it[1] }
        val loseSum = leagueResult.sumOf { it[2] }
        if (leagueResult.any { it.sum() != 5 } || winSum != loseSum || drawSum and 1 != 0 || winSum + drawSum + loseSum != 30) {
            return@repeat bw.write("0 ")
        }
        var answer = 0
        fun dfs(depth: Int) {
            if (answer == 1) return
            if (depth == 15) {
                if (leagueResult.all { it.sum() == 0 }) answer = 1
                return
            }
            val (a, b) = games[depth]
            val cases = arrayOf(0 to 2, 1 to 1, 2 to 0)
            for ((i, j) in cases) {
                if (leagueResult[a][i] > 0 && leagueResult[b][j] > 0) {
                    leagueResult[a][i]--
                    leagueResult[b][j]--
                    dfs(depth + 1)
                    leagueResult[a][i]++
                    leagueResult[b][j]++
                }
            }
        }
        dfs(0)
        bw.write("$answer ")
    }
    bw.close()
}