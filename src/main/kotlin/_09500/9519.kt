package _09500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val word = readLine()
    val tailStart = word.lastIndex - if (word.length % 2 == 1) 1 else 0
    val set = mutableSetOf<String>().apply { add(word) }
    while (true) {
        val prev = set.last()
        val sb = StringBuilder()
        for (i in prev.indices step 2) sb.append(prev[i])
        for (i in tailStart downTo 0 step 2) sb.append(prev[i])
        if (!set.add(sb.toString())) break
    }
    println(set.toList()[n % set.size])
}