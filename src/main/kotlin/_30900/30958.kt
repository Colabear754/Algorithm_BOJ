package _30900

fun main() = with(System.`in`.bufferedReader()) {
    val count = IntArray(26)
    readLine()
    val notCount = setOf(' ', ',', '.')
    for (c in readLine()) if (c !in notCount) count[c - 'a']++
    println(count.max())
}