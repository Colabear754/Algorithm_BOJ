package _30700

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val korea = "KOREA"
    var count = 0
    for (c in str) {
        if (c == korea[count % 5]) count++
    }
    println(count)
}