package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val x = readLine().toInt()
    val y = readLine().toInt()
    println(
        if (x * y > 0) {
            if (x > 0) 1
            else 3
        } else {
            if (x > 0) 4
            else 2
        }
    )
}