package _20900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val words = HashMap<String, Int>()
    repeat(n) { readLine().takeIf { it.length >= m }?.also { words[it] = (words[it] ?: 0) + 1 } }
    val sortedWords = words.keys.sortedWith { o1, o2 ->
        val c1 = words[o1] ?: 0
        val c2 = words[o2] ?: 0
        if (c1 == c2) {
            if (o1.length == o2.length) o1.compareTo(o2)
            else o2.length - o1.length
        }
        else c2 - c1
    }
    println(sortedWords.joinToString("\n"))
}