package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val (start, end) = readLine().split(' ').map { it.input(':').let { (h, m) -> h * 60 + m } }
    val (n, t) = readLine().input(' ')
    val deliveryPerDay = (end - start - 1) / t
    val day = n / deliveryPerDay
    val time = (n % deliveryPerDay + 1) * (t) + start
    val (h, m) = "${time / 60}".padStart(2, '0') to "${time % 60}".padStart(2, '0')
    println("$day\n$h:$m")
}

private fun String.input(c: Char) = split(c).map { it.toInt() }