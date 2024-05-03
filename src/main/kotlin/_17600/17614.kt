package _17600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0
    for (i in 3..n) {
        sum += i.toString().count { it == '3' || it == '6' || it == '9' }
    }
    println(sum)
}