package _02900

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c, d) = readLine().split(' ').map { it.toInt() }
    val (p, m, n) = readLine().split(' ').map { it.toInt() }
    println("${p.dog(a, b) + p.dog(c, d)}\n${m.dog(a, b) + m.dog(c, d)}\n${n.dog(a, b) + n.dog(c, d)}")
}

private fun Int.dog(a: Int, b: Int) = if (this % (a + b) in 1..a) 1 else 0