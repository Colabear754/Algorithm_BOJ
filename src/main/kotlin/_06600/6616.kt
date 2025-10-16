package _06600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var n: Int
    while (readLine().toInt().also { n = it } != 0) {
        val plain = readLine().replace(" ", "").uppercase()
        val length = plain.length
        val cipher = CharArray(length)
        var start = 0
        var count = 0
        while (count < length) {
            for (i in start..<length step n) {
                cipher[i] = plain[count++]
            }
            start++
        }
        bw.appendLine(cipher.joinToString(""))
    }
    bw.close()
}