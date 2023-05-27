package _13200

fun main() = print(getManachers(readln().toCharArray().joinToString("#", "#", "#")).max())

private fun getManachers(s: CharSequence): IntArray {
    val result = IntArray(s.length)
    var r = -1
    var p = -1
    for (i in s.indices) {
        if (i <= r) result[i] = minOf(result[2 * p - i], r - i)
        else result[i] = 0
        while (i - result[i] - 1 >= 0 && i + result[i] + 1 < s.length && s[i - result[i] - 1] == s[i + result[i] + 1]) {
            result[i]++
        }
        if (r < i + result[i]) {
            r = i + result[i]
            p = i
        }
    }
    return result
}