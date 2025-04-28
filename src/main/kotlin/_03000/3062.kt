package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        bw.write(if ((n + n.reversed).isPalindrome) "YES" else "NO")
        bw.newLine()
    }
    bw.close()
}

private val Int.isPalindrome get() = this == reversed

private val Int.reversed get(): Int {
    var x = this
    var reversed = 0
    while (x > 0) {
        reversed = reversed * 10 + x % 10
        x /= 10
    }
    return reversed
}
