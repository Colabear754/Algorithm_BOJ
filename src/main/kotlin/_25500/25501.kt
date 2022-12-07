package _25500

var cnt = 0
fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        cnt = 0
        bw.write("${isPalindrome(readLine())} $cnt\n")
    }
    bw.close()
}

fun recursion(s: String, l: Int, r: Int): Int {
    cnt++
    return if (l >= r) 1 else if (s[l] != s[r]) 0 else recursion(s, l + 1, r - 1)
}

fun isPalindrome(s: String) = recursion(s, 0, s.lastIndex)