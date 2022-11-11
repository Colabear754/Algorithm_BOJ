package _01500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(",").map { it.toInt() }.toMutableList()
    for (i in 0 until k) {
        for (j in 0 until arr.lastIndex) {
            arr[j] = arr[j + 1] - arr[j]
        }
        arr.removeAt(arr.lastIndex)
    }
    println(arr.toString().replace("[\\[\\]\\s]".toRegex(), ""))    // 배열의 문자열에서 정규표현식을 이용해 대괄호와 공백을 모두 제거하여 출력
}
