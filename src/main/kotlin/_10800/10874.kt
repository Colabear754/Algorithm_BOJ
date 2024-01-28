package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    repeat(readLine().toInt()) { if (readLine().replace("1 2 3 4 5", "").isBlank()) sb.append(it + 1).append('\n') }
    print(sb)
}