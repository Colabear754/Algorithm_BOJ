package _22800

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c, m) = readLine().split(' ').map { it.toInt() }
    var fatigue = 0
    var result = 0
    repeat(24) {
        if (fatigue + a <= m) {
            fatigue += a
            result += b
            return@repeat
        }
        fatigue = maxOf(0, fatigue - c)
    }
    println(result)
}