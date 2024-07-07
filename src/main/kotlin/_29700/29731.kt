package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val promise = setOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )
    repeat(readLine().toInt()) {
        if (readLine() !in promise) {
            println("Yes")
            return@with
        }
    }
    println("No")
}