package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = IntArray(n) { readLine().toInt() }.sortedArray()
    var max = 0
    for (i in array.indices) {
        val maxSequenceNumber = array[i] + 4
        var count = 1
        for (j in i + 1..<array.size) {
            if (array[j] <= maxSequenceNumber) count++
        }
        max = maxOf(max, count)
    }
    println(5 - max)
}