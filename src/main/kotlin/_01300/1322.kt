package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val (x, k) = readLine().split(' ').map { it.toInt().toString(2) }
    var index = k.lastIndex
    val result = StringBuilder()
    for (i in x.lastIndex downTo 0) {
        when (x[i]) {
            '1' -> result.append('0')
            else -> if (index >= 0) result.append(k[index--]) else break
        }
    }
    result.append(k.slice(index downTo 0))
    println(result.reversed().toString().toLong(2))
}