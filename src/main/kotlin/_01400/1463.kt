package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n + 1)
    for (i in 2..n) {
        val temp = intArrayOf(
            if (i % 3 == 0) arr[i / 3] + 1 else Int.MAX_VALUE,
            if (i % 2 == 0) arr[i / 2] + 1 else Int.MAX_VALUE,
            arr[i - 1] + 1).sortedArray()
        arr[i] = temp[0]
    }
    println(arr[n])
}