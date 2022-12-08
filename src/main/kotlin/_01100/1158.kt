package _01100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val circle = ArrayList<Int>()
    val josephus = ArrayList<Int>()
    var next = 0
    repeat(n) {
        circle.add(it + 1)
    }
    while (circle.isNotEmpty()) {
        next += k - 1
        while (next > circle.lastIndex) next -= circle.size
        josephus.add(circle.removeAt(next))
    }
    println("<${josephus.joinToString()}>")
}