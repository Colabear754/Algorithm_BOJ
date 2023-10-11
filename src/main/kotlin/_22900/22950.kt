package _22900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine()
    val k = readLine().toInt()
    when {
        !m.contains('1') -> println("YES")
        n <= k -> println("NO")
        else -> {
            var count = 0
            for (bit in m.reversed()) {
                if (count == k) {
                    println("YES")
                    break
                }
                if (bit =='0') count++
                else break
            }
            if (count < k) println("NO")
        }
    }
}