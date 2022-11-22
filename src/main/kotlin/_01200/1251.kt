package _01200

fun main() = with(System.`in`.bufferedReader()) {
    val word = readLine()
    val last = word.lastIndex
    var result = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"

    for (i in 0..word.lastIndex - 2) {
        for (j in i + 1..word.lastIndex - 1) {
            val new = word.slice(0..i).reversed() + word.slice(i + 1..j).reversed() + word.slice(j + 1..last).reversed()
            if (new < result)
                result = new
        }
    }
    println(result)
}