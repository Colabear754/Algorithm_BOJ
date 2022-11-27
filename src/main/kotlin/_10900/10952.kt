package _10900

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var input: String
    while (readLine().also { input = it } != "0 0") {
        sb.append("${input.sumOf { it.code } - 128}\n")
    }
    println(sb)
}