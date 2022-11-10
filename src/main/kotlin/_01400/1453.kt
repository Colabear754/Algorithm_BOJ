package _01400

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val seat = BooleanArray(100)
    val people = readLine().split(" ").map { it.toInt() }
    var count = 0
    for (p in people) {
        when (seat[p - 1]) {
            true -> count++
            false -> seat[p - 1] = true
        }
    }
    println(count)
}