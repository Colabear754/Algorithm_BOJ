package _17300

fun main() = with(System.`in`.bufferedReader()) {
    val percentage = readLine().split(' ').map { it.toInt() }
    val university = arrayOf("Soongsil", "Korea", "Hanyang")
    println(if (percentage.sum() >= 100) "OK" else university[percentage.indexOf(percentage.min())])
}