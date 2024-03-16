package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val array = IntArray(7) { readLine().toInt() }
    if (array.count { it and 1 == 1 } == 0) {
        println(-1)
        return@with
    }
    println("${array.sumOf { if (it and 1 == 1) it else 0 }}\n${array.minOf { if (it and 1 == 1) it else Int.MAX_VALUE}}")
}