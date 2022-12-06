package _02500

fun main() = with(System.`in`.bufferedReader()) {
    var maxX = 0
    var maxY = 0
    val paper = Array(readLine().toInt()) {
        readLine().split(' ').map { it.toInt() }.also { maxX = maxOf(it[0], maxX); maxY = maxOf(it[1], maxY) }
    }
    val field = Array(maxX + 10) { BooleanArray(maxY + 10) }
    repeat(paper.size) {
        for (x in paper[it][0] until paper[it][0] + 10)
            for (y in paper[it][1] until paper[it][1] + 10)
                field[x][y] = true
    }
    println(field.sumOf { it.count { p -> p } })
}