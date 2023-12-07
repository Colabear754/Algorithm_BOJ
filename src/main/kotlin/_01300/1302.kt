package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val selledBooks = HashMap<String, Int>()
    repeat(readLine().toInt()) { readLine().also { selledBooks[it] = (selledBooks[it] ?: 0) + 1 } }
    val max = selledBooks.values.maxOrNull() ?: 0
    println(selledBooks.filterValues { it == max }.keys.minOf { it })
}