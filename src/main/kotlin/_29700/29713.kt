package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val count = IntArray(26)
    readLine()
    for (c in readLine()) {
        count[c - 'A']++
    }
    var min = Int.MAX_VALUE
    for (c in "BRONZESILVER") {
        min = minOf(min, if (c in "ER") count[c - 'A'] / 2 else count[c - 'A'])
    }
    println(min)
}