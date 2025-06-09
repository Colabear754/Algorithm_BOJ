package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, h) = readLine().split(' ').map { it.toInt() }
    val size = n / 2
    val stalagmites = IntArray(size)
    val stalactites = IntArray(size)
    repeat(size) {
        stalagmites[it] = readLine().toInt()
        stalactites[it] = readLine().toInt()
    }
    stalagmites.sort()
    stalactites.sort()
    var min = Int.MAX_VALUE
    var count = 0
    for (i in 1..h) {
        val stalagmiteCount = stalagmites.binarySearch(i)
        val stalactiteCount = stalactites.binarySearch(h - i + 1)
        val destroyed = stalagmiteCount + stalactiteCount
        if (destroyed > min) continue
        if (destroyed == min) {
            count++
            continue
        }
        min = destroyed
        count = 1
    }
    println("$min $count")
}

private fun IntArray.binarySearch(value: Int): Int {
    var low = 0
    var high = size
    while (low < high) {
        val mid = (low + high) shr 1
        if (this[mid] < value) {
            low = mid + 1
            continue
        }
        high = mid
    }
    return size - high
}