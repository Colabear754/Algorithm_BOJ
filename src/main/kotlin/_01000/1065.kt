package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = if (n > 99) 99 else n
    for (i in 111..n) {
        val arr = i.toString().toCharArray().map { it - '0' }
        if (i == 1000) break
        else if (arr[1] - arr[0] == arr[2] - arr[1]) cnt++
    }
    println(cnt)
}