package _09200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String?
    while (!readLine().also { input = it }.isNullOrEmpty()) {
        val n = input!!.substring(2).toInt()
        val pow = n * n
        var count = 0
        for (i in 1..n) {
            if (pow % i != 0) continue
            if (i <= pow / i) count++
            if (i != n && pow / i <= i) count++
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}