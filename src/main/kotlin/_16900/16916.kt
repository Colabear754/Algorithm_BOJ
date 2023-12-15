package _16900

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val p = readLine()
    println(kmp(s, p))
}

private fun kmp(s: String, p: String): Int {
    val pi = IntArray(p.length)
    var j = 0
    for (i in 1..<p.length) {
        while (j > 0 && p[i] != p[j]) j = pi[j - 1]
        if (p[i] == p[j]) pi[i] = ++j
    }
    j = 0
    for (i in s.indices) {
        while (j > 0 && s[i] != p[j]) j = pi[j - 1]
        if (s[i] == p[j]) {
            if (j == p.length - 1) return 1
            else j++
        }
    }
    return 0
}