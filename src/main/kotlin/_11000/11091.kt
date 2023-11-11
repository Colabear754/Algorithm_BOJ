package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val string = readLine()
        val alpha = BooleanArray(26)
        for (char in string) {
            if (char in 'a'..'z' || char in 'A'..'Z') {
                alpha[char.lowercaseChar() - 'a'] = true
            }
        }
        val missing = CharArray(alpha.count { !it })
        var index = 0
        for (i in alpha.indices) {
            if (!alpha[i]) {
                missing[index++] = (i + 'a'.code).toChar()
            }
        }
        bw.write(if (missing.isEmpty()) "pangram\n" else "missing ${missing.joinToString("")}\n")
    }
    bw.close()
}