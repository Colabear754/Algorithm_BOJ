package _13200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.`out`.bufferedWriter()
    val thousands = arrayOf("", "M", "MM", "MMM")
    val hundreds = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    val tens = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val ones = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    val map = mapOf(
        'I' to 1, 'V' to 5,
        'X' to 10, 'L' to 50,
        'C' to 100, 'D' to 500,
        'M' to 1000
    )
    val regex = Regex("^\\d+$")
    repeat(readLine().toInt()) {
        readLine().run {
            bw.appendLine(if (matches(regex))
                toInt().let { n -> "${thousands[n / 1000]}${hundreds[(n % 1000) / 100]}${tens[(n % 100) / 10]}${ones[n % 10]}" }
            else {
                var sum = 0
                for (i in 0..<length) {
                    val value = map[this[i]] ?: 0
                    if (i + 1 < length && (value < (map[this[i + 1]] ?: 0))) sum -= value else sum += value
                }
                "$sum"
            })
        }
    }
    bw.close()
}