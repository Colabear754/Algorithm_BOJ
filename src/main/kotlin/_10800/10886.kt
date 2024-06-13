package _10800

fun main() = with(System.`in`.bufferedReader()) {
    var zero = 0
    var one = 0
    repeat(readLine().toInt()) {
        if (readLine() == "0") zero++ else one++
    }
    println("Junhee is ${if (zero > one) "not " else ""}cute!")
}