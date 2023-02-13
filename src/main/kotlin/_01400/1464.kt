package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine()
    val sb = StringBuilder("${input[0]}")
    for (i in 1..input.lastIndex) {
        if (sb[i - 1] < input[i]) sb.insert(0, input[i])
        else sb.append(input[i])
    }
    println(sb.reverse())
}