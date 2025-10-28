package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val p = readLine()
    var start = 0
    var count = 0
    for (i in p.indices) {
        if (p.slice(start..i) !in s) {
            start = i
            count++
        }
    }
    println(count + 1)
}