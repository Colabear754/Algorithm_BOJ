package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0
    case@ for (i in 1..n) {
        val str = readLine()
        val check = BooleanArray(26)
        check[str[0] - 'a'] = true
        for (j in 1..str.lastIndex) {
            if (!check[str[j] - 'a']) {
                check[str[j] - 'a'] = true
            } else if (str[j] != str[j - 1]) {
                continue@case
            }
        }
        cnt++
    }
    println(cnt)
}