package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val picture = Array(n) { readLine() }
    val sb = StringBuilder()
    quadTree(n, 0, 0, picture, sb)
    println(sb)
}

private fun quadTree(n: Int, x: Int, y: Int, picture: Array<String>, sb: StringBuilder) {
    val count = picture.slice(y until y + n).sumOf { s -> s.slice(x until x + n).count { c -> c == '1' } }
    if (count == n * n) {
        sb.append('1')
        return
    } else if (count == 0) {
        sb.append('0')
        return
    }
    sb.append('(')
    val next = n / 2
    quadTree(next, x, y, picture, sb)
    quadTree(next, x + next, y, picture, sb)
    quadTree(next, x, y + next, picture, sb)
    quadTree(next, x + next, y + next, picture, sb)
    sb.append(')')
}