package _32700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val ingredients = java.util.StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
    val recipe = readLine()
    if (recipe.first() != 'a' || recipe.last() != 'a') return@with println("No")
    if (--ingredients[0] < 0) return@with println("No")
    for (i in 1..<n) {
        if (recipe[i] == recipe[i - 1]) return@with println("No")
        if (--ingredients[recipe[i] - 'a'] < 0) return@with println("No")
    }
    println("Yes")
}