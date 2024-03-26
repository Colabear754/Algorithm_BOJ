package _25100

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val str = readLine()
    var count = 1
    for (i in 1..<str.length) {
        if (str[i] == str[i - 1] - 1 || str[i] == str[i - 1] + 1) {
            count++
            if (count >= 5) {
                println("YES")
                return@with
            }
        } else {
            count = 1
        }
    }
    println("NO")
}