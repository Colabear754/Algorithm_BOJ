package _33500

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    repeat(3 * n) { i ->
        when (i % 3) {
            0 -> sb.append("Z".repeat(n)).append("N".repeat(n)).append("A".repeat(n))
            1 -> sb.append("N".repeat(n)).append("A".repeat(n)).append("Z".repeat(n))
            2 -> sb.append("A".repeat(n)).append("Z".repeat(n)).append("N".repeat(n))
        }
        sb.appendLine()
    }
    println(sb)
}