package _09600

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    var a = 1
    var b = 0
    repeat(k) { a = b.also { b += a } }
    println("$a $b")
}