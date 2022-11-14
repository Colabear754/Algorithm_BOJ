package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val plain = readLine()
    val key = readLine()
    var crypt = ""
    for (i in plain.indices) {
        when (plain[i]) {
            ' ' -> crypt += plain[i]
            else -> {
                var c = plain[i].code - key[i % key.length].code - 1
                c += if (c < 0) 'z'.code + 1 else 'a'.code
                crypt += c.toChar()
            }
        }
    }
    println(crypt)
}