package _02900

fun main() = with(System.`in`.bufferedReader()) {
    val input = List(3) { readLine() }
    println(
        when (input[1]) {
            "+" -> input[0].toBigInteger() + input[2].toBigInteger()
            "*" -> input[0].toBigInteger() * input[2].toBigInteger()
            else -> throw Exception()
        }
    )
}