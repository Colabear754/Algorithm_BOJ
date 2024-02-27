package _26000

fun main() = with(System.`in`.bufferedReader()) {
    var a = readLine()
    readLine().split(' ').forEach { a = a.replace(it, it.lowercase()) }
    println(a)
}