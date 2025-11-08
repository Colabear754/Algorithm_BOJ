package _05600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val coefficients = intArrayOf(1, 2, 6, 24, 120)
    var input: String
    while (readLine().also { input = it } != "0") {
        var result = 0
        for (i in input.indices) {
            result += (input[i] - '0') * coefficients[input.lastIndex - i]
        }
        bw.appendLine("$result")
    }
    bw.close()
}