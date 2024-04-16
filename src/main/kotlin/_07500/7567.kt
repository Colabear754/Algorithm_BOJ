package _07500

fun main() = with(System.`in`.bufferedReader()) {
    var height = 10
    val dishes = readLine()
    for (i in 1..dishes.lastIndex) {
        height += if (dishes[i - 1] == dishes[i]) 5 else 10
    }
    println(height)
}