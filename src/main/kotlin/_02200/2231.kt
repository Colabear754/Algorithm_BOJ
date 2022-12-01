package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for (i in 1..1000000) {
        var sum = i
        var num = i

        while (num != 0) {
            sum += num % 10
            num /= 10
        }

        if (n == sum) {
            println(i)
            return@with
        }
    }
    println(0)
}