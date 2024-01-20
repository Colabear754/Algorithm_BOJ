package _21500

fun main() = with(System.`in`.bufferedReader()) {
    val count = IntArray(10)
    val num = readLine().toLong() * readLine().toLong() * readLine().toLong()
    for (n in num.toString()) {
        count[n - '0']++
    }
    println(count.joinToString("\n"))
}
