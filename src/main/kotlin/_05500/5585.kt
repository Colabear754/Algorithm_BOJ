package _05500

fun main() = with(System.`in`.bufferedReader()) {
    var change = 1000 - readLine().toInt()
    var count = 0
    while (change > 0) {
        change %= when {
            change >= 500 -> 500.also { count += change / 500 }
            change >= 100 -> 100.also { count += change / 100 }
            change >= 50 -> 50.also { count += change / 50 }
            change >= 10 -> 10.also { count += change / 10 }
            change >= 5 -> 5.also { count += change / 5 }
            else -> 1.also { count += change }
        }
    }
    println(count)
}