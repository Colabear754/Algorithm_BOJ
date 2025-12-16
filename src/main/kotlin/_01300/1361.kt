package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val s1 = readLine()
    val s2 = readLine()
    val (prefix1, suffix1) = s1.split("*")
    val (prefix2, suffix2) = s2.split("*")
    if (!(prefix1.startsWith(prefix2) || prefix2.startsWith(prefix1))
        || !(suffix1.endsWith(suffix2) || suffix2.endsWith(suffix1))) {
        return@with println(-1)
    }
    val left = if (prefix1.length > prefix2.length) prefix1 else prefix2
    val right = if (suffix1.length > suffix2.length) suffix1 else suffix2
    val minLength = maxOf(s1.length, s2.length) - 1
    for (i in minOf(left.length, right.length) downTo 0) {
        if (left.regionMatches(left.length - i, right, 0, i) && left.length + right.length - i >= minLength) {
            return@with println(left + right.drop(i))
        }
    }
}