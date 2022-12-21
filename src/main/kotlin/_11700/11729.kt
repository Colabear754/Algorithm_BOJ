package _11700

var count = 0
val sb = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) {
    hanoi(readLine().toInt(), 1, 2, 3)
    println(count)
    println(sb)
}

fun hanoi(n: Int, from: Int, mid: Int, to: Int) {
    if (n <= 1) {
        count++
        sb.append("$from $to\n")
        return
    }
    hanoi(n - 1, from, to, mid)
    count++
    sb.append("$from $to\n")
    hanoi(n - 1, mid, from, to)
}