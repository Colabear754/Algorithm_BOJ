package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val chessBoard = Array(8) { readLine() }
    var score = 0
    chessBoard.forEach {
        for (c in it) {
            when (c) {
                'P' -> score++
                'p' -> score--
                'N', 'B' -> score += 3
                'n', 'b' -> score -= 3
                'R' -> score += 5
                'r' -> score -= 5
                'Q' -> score += 9
                'q' -> score -= 9
            }
        }
    }
    println(score)
}