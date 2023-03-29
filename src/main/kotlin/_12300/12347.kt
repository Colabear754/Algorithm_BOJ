package _12300

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val n = str.toULong()
    val length = str.length
    if (n <= 99u) {
        println(n)
        return@with
    }
    var count = 99
    for (i in 1..9) {
        for (j in 1..9) {
            val s = StringBuilder("$i$j")
            val diff = j - i
            for (k in 1..length - 2) {
                val next = (s.last() - '0') + diff
                if (next !in 0..9) break
                s.append(next)
                if (s.toString().toULong() <= n) {
                    count++
                }
            }
        }
    }
    println(count)
}