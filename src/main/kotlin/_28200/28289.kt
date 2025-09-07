package _28200

fun main() = with(System.`in`.bufferedReader()) {
    val students = IntArray(4)
    repeat(readLine().toInt()) {
        val input = readLine()
        if (input[0] == '1') {
            students[3]++
            return@repeat
        }
        when (input[2]) {
            '1', '2' -> students[0]++
            else -> students[input[2] - '0' - 2]++
        }
    }
    println(students.joinToString("\n"))
}