package _14900

fun main() = with(System.`in`.bufferedReader()) {
    java.util.StringTokenizer(readLine()).run {
        var current = nextToken().toInt()
        while (hasMoreTokens()) {
            val next = nextToken().toInt()
            if (current > next) {
                return@with println("Bad")
            }
            current = next
        }
    }
    println("Good")
}