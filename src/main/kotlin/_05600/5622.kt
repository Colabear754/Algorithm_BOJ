package _05600

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    var sec = 0
    for (c in str) {
        sec += getSec(c)
    }
    println(sec)
}

private fun getSec(c: Char) = when (c) {
    in 'A'..'C' -> 3
    in 'D'..'F' -> 4
    in 'G'..'I' -> 5
    in 'J'..'L' -> 6
    in 'M'..'O' -> 7
    in 'P'..'S' -> 8
    in 'T'..'V' -> 9
    in 'W'..'Z' -> 10
    else -> 11
}