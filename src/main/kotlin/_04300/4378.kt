package _04300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val wrongToCorrectMap = mutableMapOf(
        '1' to '`', '2' to '1', '3' to '2', '4' to '3', '5' to '4', '6' to '5', '7' to '6', '8' to '7', '9' to '8', '0' to '9', '-' to '0', '=' to '-',
        'W' to 'Q', 'E' to 'W', 'R' to 'E', 'T' to 'R', 'Y' to 'T', 'U' to 'Y', 'I' to 'U', 'O' to 'I', 'P' to 'O', '[' to 'P', ']' to '[', '\\' to ']',
        'S' to 'A', 'D' to 'S', 'F' to 'D', 'G' to 'F', 'H' to 'G', 'J' to 'H', 'K' to 'J', 'L' to 'K', ';' to 'L', '\'' to ';',
        'X' to 'Z', 'C' to 'X', 'V' to 'C', 'B' to 'V', 'N' to 'B', 'M' to 'N', ',' to 'M', '.' to ',', '/' to '.'
    )
    var input: String?
    while (!readLine().also { input = it }.isNullOrEmpty()) {
        input!!.forEach { bw.write("${wrongToCorrectMap[it] ?: it}") }
        bw.newLine()
    }
    bw.close()
}