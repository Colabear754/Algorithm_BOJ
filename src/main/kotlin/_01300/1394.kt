package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val positions = mutableMapOf<Char, Int>()
    val characters = readLine()
    for ((i, c) in characters.withIndex()) {
        positions[c] = i + 1
    }
    val password = readLine()
    var result = 0
    for (c in password) {
        result = (result * characters.length + positions[c]!!) % 900528
    }
    println(result)
}