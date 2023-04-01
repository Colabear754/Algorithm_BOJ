package _04500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var a: Long
    while (readLine().apply { a = toLong() } != "0") {
        var count = 0
        val n = a * a
        for (i in 1..a) {
            val checkNum = n.toDouble() / i
            if (n % i == 0L) {
                if (((checkNum + i) / 2) % 1 == 0.0 && ((checkNum - i) / 2) % 1 == 0.0 && ((checkNum - i) / 2) > a) count++
            }
        }
        bw.write("$count\n")
    }
    bw.close()
}