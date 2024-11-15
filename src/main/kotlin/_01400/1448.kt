package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val straws = IntArray(readLine().toInt()) { readLine().toInt() }.sortedArrayDescending()
    for (i in 2..<straws.size) {
        if (straws[i - 2] < straws[i - 1] + straws[i]) {
            println(straws[i - 2] + straws[i - 1] + straws[i])
            return@with
        }
    }
    println(-1)
}