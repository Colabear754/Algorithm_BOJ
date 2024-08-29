package _12800

fun main() = with(System.`in`.bufferedReader()) {
    val (s, p) = readLine().split(' ').map { it.toInt() }
    val count = Array(s + 1) { IntArray(4) }
    val str = readLine()
    for (i in 1..s) {
        for (j in 0..3) count[i][j] = count[i - 1][j]
        when (str[i - 1]) {
            'A' -> count[i][0]++
            'C' -> count[i][1]++
            'G' -> count[i][2]++
            'T' -> count[i][3]++
        }
    }
    val needed = readLine().split(' ').map { it.toInt() }
    var start = 0
    var end = p
    var result = 0
    while (end <= s) {
        if (
             count[end][0] - count[start][0] >= needed[0] &&
             count[end][1] - count[start][1] >= needed[1] &&
             count[end][2] - count[start][2] >= needed[2] &&
             count[end][3] - count[start][3] >= needed[3]
        ) result++
        start++
        end++
    }
    println(result)
}