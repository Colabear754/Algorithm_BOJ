package _02900

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(' ').map { it.toInt() }
    var result = when (input[0] - input[1]) {
        -1 -> "ascending"
        1 -> "descending"
        else -> "mixed"
    }
    if (result == "mixed") {
        println(result)
        return@with
    }

    for (i in 1 until input.lastIndex) {
        if (input[i] + 1 == input[i + 1] || input[i] - 1 == input[i + 1]) {
            continue
        } else {
            result = "mixed"
            break
        }
    }
    println(result)
}