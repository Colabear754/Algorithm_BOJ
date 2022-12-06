package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val field = Array(100) { BooleanArray(100) }
    repeat(readLine().toInt()) {
        readLine().split(' ').map { it.toInt() }.let { p ->
            for (x in p[0] until p[0] + 10)
                for (y in p[1] until p[1] + 10)
                    field[x][y] = true
        }
    }
    println(field.sumOf { it.count { p -> p } })
}