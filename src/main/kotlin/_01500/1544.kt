package _01500

fun main() = with(System.`in`.bufferedReader()) {
    val wordSet = mutableSetOf<String>()
    repeat(readLine().toInt()) {
        val word = readLine()
        val length = word.length
        var i = 0
        var j = 1
        var k = 0
        while (i < length && j < length && k < length) {
            val char1 = word[(i + k) % length]
            val char2 = word[(j + k) % length]
            if (char1 == char2) {
                k++
                continue
            }
            if (char1 > char2) i += k + 1
            else j += k + 1
            if (i == j) j++
            k = 0
        }
        val base = minOf(i, j)
        wordSet.add(word.drop(base) + word.take(base))
    }
    println(wordSet.size)
}