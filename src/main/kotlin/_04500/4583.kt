package _04500

fun main() = with(System.`in`.bufferedReader()) {
    val mirror = CharArray(26) { ' ' }
    mirror['b' - 'a'] = 'd'
    mirror['d' - 'a'] = 'b'
    mirror['p' - 'a'] = 'q'
    mirror['q' - 'a'] = 'p'
    mirror['i' - 'a'] = 'i'
    mirror['o' - 'a'] = 'o'
    mirror['v' - 'a'] = 'v'
    mirror['w' - 'a'] = 'w'
    mirror['x' - 'a'] = 'x'
    val sb = StringBuilder()
    var input: String
    while (readLine().also { input = it } != "#") {
        sb.append(input.reversed().map { mirror[it - 'a'] }.takeUnless { ' ' in it }?.joinToString("") ?: "INVALID").append('\n')
    }
    print(sb)
}