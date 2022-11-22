package _01400

fun main() = with(System.`in`.bufferedReader()){
    val (e, s, m) = readLine().split(" ").map { it.toInt() }
    var year = 1
    while (true) {
        if (year cal 15 == e && year cal 28 == s && year cal 19 == m) {
            println(year)
            break
        }
        year++
    }
}
private infix fun Int.cal(n: Int) = if (this % n == 0) n else this % n