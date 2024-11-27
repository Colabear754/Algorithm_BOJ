package _15900

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val actions = readLine()
    var waiting = 0
    var count = 5
    for (action in actions) {
        when (action) {
            'P' -> when (waiting) {
                0 -> count = if (count == 5) 1 else 5
                1 -> count = 6
            }
            'W' -> waiting++
        }
    }
    println(if (waiting < 2) 0 else count)
}