package _16600

fun main() = with(System.`in`.bufferedReader()) {
    val honor = IntArray(readLine().toInt()) { readLine().toInt() }.sortedArray()
    var target = 1
    var hackers = 0L
    for (i in honor.indices) {
        if (honor[i] < target) continue
        hackers += honor[i] - target
        honor[i] = target++
    }
    println(hackers)
}