package _10100

fun main() = with(System.`in`.bufferedReader()) {
    var time = readLine().toInt()
    val a = time / 300
    time %= 300
    val b = time / 60
    time %= 60
    val c = time / 10
    time %= 10
    println(if (time == 0) "$a $b $c" else "-1")
}