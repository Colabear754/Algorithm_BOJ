package _27900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    val hangers = CharArray(n)
    var up = 0
    var down = 0
    var both = 0
    StringTokenizer(readLine()).apply { repeat(n) {
        when (nextToken()) {
            "1" -> hangers[it] = 'U'.also { up++ }
            "2" -> hangers[it] = 'D'.also { down++ }
            "3" -> hangers[it] = '?'.also { both++ }
        }
    } }
    val (shirts, pants) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
    var remainShirts = shirts - up
    if (remainShirts > both || pants - down > both) return@with println("NO")
    sb.append("YES\n")
    for (clothes in hangers) {
        if (clothes != '?') {
            sb.append(clothes)
            continue
        }
        sb.append(if (remainShirts-- > 0) 'U' else 'D')
    }
    println(sb)
}