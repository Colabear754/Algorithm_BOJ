package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.`out`.bufferedWriter()
    lateinit var number: String
    while (readLine().also { number = it } != "0") {
        while (number.length > 1) {
            number = number.sumOf { it - '0' }.toString()
        }
        bw.write(number)
        bw.newLine()
    }
    bw.close()
}