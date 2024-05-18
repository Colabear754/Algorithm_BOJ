package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val g = readLine().toInt()
    var prev = 0
    var current = 1
    val squareList = mutableListOf<Int>()
    while (current * current - prev * prev <= g) {
        squareList.add(current++)
        prev++
    }
    val set = mutableSetOf<Int>()
    val result = mutableListOf<Int>()
    for (n in squareList) {
        set.add(n * n)
        if (set.contains(n * n - g)) result.add(n)
    }
    println(if (result.isEmpty()) -1 else result.joinToString("\n"))
}