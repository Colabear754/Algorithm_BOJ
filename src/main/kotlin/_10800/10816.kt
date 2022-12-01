package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val hash = HashMap<String, Int>()
    var card: String
    repeat(n) {
        card = st.nextToken()
        hash[card] = if (hash.contains(card)) hash[card]!! + 1 else 1
    }
    readLine()
    val list = readLine().split(' ')
    for (s in list) {
        sb.append("${hash[s] ?: 0} ")
    }
    println(sb)
}