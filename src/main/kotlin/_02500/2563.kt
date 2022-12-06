package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val paper = Array(readLine().toInt()) { readLine().split(' ').map { it.toInt() } }
    val field = Array(100) { BooleanArray(100) }
    repeat(paper.size) {
        for (x in paper[it][0] until paper[it][0] + 10)
            for (y in paper[it][1] until paper[it][1] + 10)
                field[x][y] = true
    }
    println(field.sumOf { it.count { p -> p } })
}