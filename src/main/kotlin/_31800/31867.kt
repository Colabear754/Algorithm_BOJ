package _31800

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val k = readLine()
    var evenCount = 0
    var oddCount = 0
    for (num in k) {
        if (num - '0' and 1 == 0) evenCount++
        else oddCount++
    }
    println(if (evenCount > oddCount) 0 else if (oddCount > evenCount) 1 else -1)
}