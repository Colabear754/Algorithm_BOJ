package _02500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputs = Array(n) { Input(StringTokenizer(readLine())) }
    var count = 0
    for (i in 123..987) {
        val number = i.toString()
        if (number.toSet().size < 3 || number.contains('0')) continue
        var isAble = true
        for (input in inputs) {
            var strike = 0
            var ball = 0
            for (j in 0..2) {
                if (number[j] == input.number[j]) strike++
                else if (number.contains(input.number[j])) ball++
            }
            if (strike != input.strike || ball != input.ball) {
                isAble = false
                break
            }
        }
        if (isAble) count++
    }
    println(count)
}

private class Input(st: StringTokenizer) {
    val number = st.nextToken()!!
    val strike = st.nextToken().toInt()
    val ball = st.nextToken().toInt()
}