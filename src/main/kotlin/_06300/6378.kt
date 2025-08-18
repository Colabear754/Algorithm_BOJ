package _06300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0") {
        var sum = input.sumOf { it - '0' }
        while (sum > 9) {
            sum = "$sum".sumOf { it - '0' }
        }
        bw.write("$sum")
        bw.newLine()
    }
    bw.close()
}