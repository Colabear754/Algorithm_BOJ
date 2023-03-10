package _10000

fun main() = with(System.`in`.bufferedReader()) {
    val normal = Array(readLine().toInt()) { readLine() }
    val weakness = normal.copyOf().map { it.replace('G', 'R') }.toTypedArray()
    var normalCount = 0
    var weaknessCount = 0
    for (i in normal.indices) {
        for (j in normal[i].indices) {
            if (dfs(i, j, normal, normal.size)) normalCount++
            if (dfs(i, j, weakness, weakness.size)) weaknessCount++
        }
    }
    println("$normalCount $weaknessCount")
}

private fun dfs(r: Int, c: Int, picture: Array<String>, n: Int): Boolean {
    if (picture[r][c] == '-') return false
    val color = picture[r][c]
    picture[r] = picture[r].replaceRange(c..c, "-")
    if (r in 0 until n && c + 1 in 0 until n && picture[r][c + 1] == color) dfs(r, c + 1, picture, n)
    if (r in 0 until n && c - 1 in 0 until n && picture[r][c - 1] == color) dfs(r, c - 1, picture, n)
    if (r + 1 in 0 until n && c in 0 until n && picture[r + 1][c] == color) dfs(r + 1, c, picture, n)
    if (r - 1 in 0 until n && c in 0 until n && picture[r - 1][c] == color) dfs(r - 1, c, picture, n)
    return true
}