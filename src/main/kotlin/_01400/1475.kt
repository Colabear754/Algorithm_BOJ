package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val count = IntArray(10)
    readLine().forEach { count[it - '0']++ }
    count[6] = ((count[6] + count[9] + 1) / 2).also { count[9] = it }
    println(count.max())
}