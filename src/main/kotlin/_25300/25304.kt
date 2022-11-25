package _25300

fun main() = with(System.`in`.bufferedReader()) {
    var total = readLine().toInt()
    repeat(readLine().toInt()) {
        readLine().split(' ').map { it.toInt() }.let { total -= it[0] * it[1] }
    }
    println(if (total == 0) "Yes" else "No")
}