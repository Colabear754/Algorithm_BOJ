package _30000

fun main() = with(System.`in`.bufferedReader()) {
    when (val n = readLine().toInt()) {
        1 -> println("YES\n1")
        2 -> println("NO")
        else -> {
            val arr = arrayListOf(1, 3, 2)
            for (i in 4..n) arr.add(i)
            println("YES\n${arr.joinToString(" ")}")
        }
    }
}