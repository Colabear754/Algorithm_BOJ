package _08500

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    var sum = 0L
    var num = 0
    for (c in readLine()) {
        if (c in '0'..'9') {
            num *= 10
            num += c - '0'
        } else {
            sum += num
            num = 0
        }
    }
    sum += num
    println(sum)
}