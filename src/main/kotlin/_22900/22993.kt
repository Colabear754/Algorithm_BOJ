package _22900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    var junwon = st.nextToken().toLong()
    val players = LongArray(n - 1) { st.nextToken().toLong() }.sortedArray()
    for (player in players) {
        if (junwon <= player) {
            println("No")
            return@with
        }
        junwon += player
    }
    println("Yes")
}