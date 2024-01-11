package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val attendanceRecord = HashMap<String, Int>()
    var count = 0
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val name = nextToken()
            when (nextToken()) {
                "+" -> attendanceRecord[name] = (attendanceRecord[name] ?: 0) + 1
                "-" -> if ((attendanceRecord[name] ?: 0) == 0) count++ else attendanceRecord[name] = (attendanceRecord[name] ?: 0) - 1
            }
        }
    }
    println(attendanceRecord.values.sum() + count)
}