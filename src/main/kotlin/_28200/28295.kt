package _28200

fun main() = with(System.`in`.bufferedReader()) {
    var direction = 0
    repeat(10) {
        when (readLine()) {
            "1" -> direction++
            "2" -> direction += 2
            "3" -> direction--
        }
    }
    println(when (direction % 4) {
        0 -> "N"
        1, -3 -> "E"
        2, -2 -> "S"
        3, -1 -> "W"
        else -> ""
    })
}