package _04300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0 0") {
        var (a, b) = java.util.StringTokenizer(input).run { nextToken() to nextToken() }
        var count = 0
        var carry = 0
        val maxLength = maxOf(a.length, b.length)
        a = a.padStart(maxLength, '0')
        b = b.padStart(maxLength, '0')
        for (i in maxLength - 1 downTo 0) {
            val sum = (a[i] - '0') + (b[i] - '0') + carry
            if (sum >= 10) {
                carry = 1
                count++
                continue
            }
            carry = 0
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}