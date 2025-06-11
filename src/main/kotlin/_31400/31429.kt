package _31400

fun main() = with(System.`in`.bufferedReader()) {
    val scoreBoard = mapOf(
        1 to "12 1600",
        2 to "11 894",
        3 to "11 1327",
        4 to "10 1311",
        5 to "9 1004",
        6 to "9 1178",
        7 to "9 1357",
        8 to "8 837",
        9 to "7 1055",
        10 to "6 556",
        11 to "6 773"
    )
    println(scoreBoard[readLine().toInt()])
}