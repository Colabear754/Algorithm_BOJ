package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0
    case@ for (i in 1..n) {
        val str = readLine()
        val check = BooleanArray(26)    // 알파벳이 나온적이 있는지 체크
        check[str[0] - 'a'] = true
        for (j in 1..str.lastIndex) {
            // 이전 문자와 현재 문자가 다르고
            if (str[j] != str[j - 1]) {
                // 현재 문자가 나온적이 있으면 다음 케이스로 넘어감
                if (check[str[j] - 'a']) {
                    continue@case
                } else {
                    check[str[j] - 'a'] = true
                }
            }
        }
        cnt++
    }
    println(cnt)
}