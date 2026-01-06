package _04500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val input = readLine()
        if (input.length == 1) {
            bw.appendLine(input)
            return@repeat
        }
        val secondDigit = input[1] - '0'
        when (secondDigit) {
            in 0..3 -> bw.appendLine("${input.first()}${"0".repeat(input.length - 1)}")
            in 5..9 -> bw.appendLine("${input.first() - '0' + 1}${"0".repeat(input.length - 1)}")
            else -> {
                var result = input.toInt()
                var divisor = 10
                while (divisor < result) {
                    result = (result + divisor / 2) / divisor * divisor
                    divisor *= 10
                }
                bw.appendLine("$result")
            }
        }
    }
    bw.close()
}