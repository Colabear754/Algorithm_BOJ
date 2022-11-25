package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val x = readLine().toInt()
    var cnt = if (x > 99) 99 else x
    for (i in 100..x) {
        val arr = i.toString().toCharArray().map { it - '0' }
        if (i == 1000) break
        else if (arr[1] - arr[0] == arr[2] - arr[1]) cnt++
    }
    println(cnt)
}