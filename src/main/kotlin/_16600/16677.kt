package _16600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine()
    val n = readLine().toInt()
    val coldwords = ArrayList<ColdWord>()
    repeat(n) { StringTokenizer(readLine()).run {
        nextToken().let { w ->
            if (!m.isPartial(w)) return@repeat
            coldwords.add(ColdWord(w, nextToken().toDouble() / (w.length - m.length), it))
        }
    } }
    if (coldwords.isEmpty()) {
        println("No Jam")
        return@with
    }
    println(coldwords.sortedWith(compareBy({ -it.grade }, { it.order })).first().word)
}

private class ColdWord(val word: String, val grade: Double, val order: Int)

private fun String.isPartial(s: String): Boolean {
    if (length > s.length) return false
    var i = 0
    var j = 0
    while (i < length && j < s.length) {
        if (this[i] == s[j]) i++
        j++
    }
    return i == length
}