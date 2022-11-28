package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(10) { readLine().toInt() }
    val set = HashSet<Int>()
    for (n in arr) {
        set.add(n % 42)
    }
    println(set.size)
}