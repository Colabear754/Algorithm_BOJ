package _10500

fun main() = with(System.`in`.bufferedReader()) {
    val players = HashMap<String, Int>()
    val n = readLine().toInt()
    repeat(n) {
        val name = readLine()
        players[name] = players[name]?.plus(1) ?: 1
    }
    repeat(n - 1) {
        val name = readLine()
        players[name] = players[name]?.minus(1) ?: 0
        if (players[name] == 0) players.remove(name)
    }
    println(players.keys.joinToString(""))
}