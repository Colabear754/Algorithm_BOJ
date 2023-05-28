package _16100

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine().toCharArray().joinToString("#", "#", "#")
    val manachers = IntArray(s.length)
    var result = 0L
    var r = -1
    var p = -1
    for (i in s.indices) {
        if (s[i] != '#') result++
        if (i <= r) {
            manachers[i] = minOf(manachers[2 * p - i], r - i)
            result += manachers[i] / 2
        }
        else manachers[i] = 0
        while (i - manachers[i] - 1 >= 0 && i + manachers[i] + 1 < s.length && s[i - manachers[i] - 1] == s[i + manachers[i] + 1]) {
            manachers[i]++
            if (s[i + manachers[i]] != '#') result++
        }
        if (r < i + manachers[i]) {
            r = i + manachers[i]
            p = i
        }
    }
    println(result)
}