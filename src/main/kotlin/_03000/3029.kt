package _03000

fun main() = with(System.`in`.bufferedReader()) {
    fun readTime() = readLine().split(':').map { it.toInt() }.let { it[0] * 3600 + it[1] * 60 + it[2] }
    val time1 = readTime()
    val time2 = readTime()
    println((time2 - time1 + if (time2 <= time1) 86400 else 0).let { "%02d:%02d:%02d".format(it / 3600, it % 3600 / 60, it % 60) })
}