package _23000

fun main() = with(System.`in`.bufferedReader()) {
    var result = 0
    for (d in readLine()) result += (d - '0').pow()
    println(result)
}

private fun Int.pow() = this * this * this * this * this