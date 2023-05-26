package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val histogram = IntArray(1) + IntArray(n) { readLine().toInt() }
    val tree = IntArray(4 * n).apply { init(histogram, 1, n, 1) }
    println(tree.maxSize(histogram, 1, n))
}

private fun IntArray.init(array: IntArray, start: Int, end: Int, node: Int) {
    if (start == end) {
        this[node] = start
        return
    }
    val mid = (start + end) / 2
    val next = node * 2
    init(array, start, mid, next)
    init(array, mid + 1, end, next + 1)
    this[node] = if (array[this[next]] <= array[this[next + 1]]) this[next] else this[next + 1]
}

private fun IntArray.find(array: IntArray, start: Int, end: Int, node: Int, left: Int, right: Int): Int {
    if (left > end || right < start) return -1
    if (left <= start && end <= right) return this[node]
    val mid = (start + end) / 2
    val leftIndex = find(array, start, mid, node * 2, left, right)
    val rightIndex = find(array, mid + 1, end, node * 2 + 1, left, right)
    return when {
        leftIndex == -1 -> rightIndex
        rightIndex == -1 -> leftIndex
        else -> if (array[leftIndex] <= array[rightIndex]) leftIndex else rightIndex
    }
}

private fun IntArray.maxSize(array: IntArray, start: Int, end: Int): Long {
    if (start > end) return 0
    val height = find(array, 1, array.size - 1, 1, start, end)
    return maxOf((end - start + 1) * array[height].toLong(), maxSize(array, start, height - 1), maxSize(array, height + 1, end))
}