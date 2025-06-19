package _02900

fun main() = with(System.`in`.bufferedReader()) {
    val x = readLine().toCharArray()
    var i = x.size - 2
    while (i >= 0 && x[i] >= x[i + 1]) i--
    if (i < 0) {
        return@with println(0)
    }
    var j = x.size - 1
    while (x[j] <= x[i]) j--
    x[i] = x[j].also { x[j] = x[i] }
    val sorted = x.copyOfRange(i + 1, x.size).sortedArray()
    for (k in sorted.indices) {
        x[i + 1 + k] = sorted[k]
    }
    println(x.concatToString())
}