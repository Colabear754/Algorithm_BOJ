package _10100

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    var a = 0
    var b = 0
    readLine().forEach {
        when (it) {
            'A' -> a++
            'B' -> b++
        }
    }
    println(when {
        a > b -> "A"
        a < b -> "B"
        else -> "Tie"
    })
}