package _01800

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val crt = readLine()
    val arr = Array(crt.length / k) { "" }
    for (i in arr.indices) {
        arr[i] = if (i % 2 == 0) crt.substring(k * i, k * (i + 1)) else crt.substring(k * i, k * (i + 1)).reversed()
    }
    for (i in arr[0].indices) {
        for (j in arr.indices) {
            print(arr[j][i])
        }
    }
}