package _09200

fun main() = with(System.`in`.bufferedReader()) {
    val input = List(2) { readLine() }
    val output = readLine()
    val lps = output.run {
        val result = IntArray(length)
        var currentLength = 0
        var i = 1
        while (i < length) {
            if (this[i] == this[currentLength]) {
                result[i++] = ++currentLength
                continue
            }
            if (currentLength > 0) {
                currentLength = result[currentLength - 1]
                continue
            }
            result[i++] = 0
        }
        result
    }
    for (str in input) {
        var i = 0
        var j = 0
        var isFound = false
        while (i < str.length) {
            if (str[i] == output[j]) {
                i++
                j++
                if (j == output.length) {
                    isFound = true
                    break
                }
                continue
            }
            if (j > 0) {
                j = lps[j - 1]
                continue
            }
            i++
        }
        if (!isFound) {
            println("NO")
            return@with
        }
    }
    println("YES")
}