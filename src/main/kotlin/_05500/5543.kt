package _05500

fun main() = with(System.`in`.bufferedReader()) {
    println(IntArray(3) { readLine().toInt() }.min() + IntArray(2) { readLine().toInt() }.min() - 50)
}