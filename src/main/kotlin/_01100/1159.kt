package _01100

fun main() {
    val n = readln().toInt()
    val players = Array(n) { ' ' }
    var result = ""
    var count = 1
    for (i in 0 until n) {
        players[i] = readln()[0]
    }
    players.sort()
    for (i in 0 until players.size - 1) {
        if (players[i] == players[i + 1]) {
            count++
        } else {
            count = 1
        }
        if (count == 5) {
            result += players[i]
        }
    }
    println(when (result) {
        "" -> "PREDAJA"
        else -> result
    })
}