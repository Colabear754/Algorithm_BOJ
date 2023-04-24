package _10700

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val arr = Array(5) { readLine() }
    val max = arr.maxOf { it.lastIndex }
    for (i in 0..max) {
        for (j in 0..4) {
            if (i < arr[j].length) {
                sb.append(arr[j][i])
            }
        }
    }
    print(sb)
}