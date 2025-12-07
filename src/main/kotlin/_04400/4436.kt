package _04400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String?
    val target = 1023
    while (!readLine().also { input = it }.isNullOrEmpty()) {
        val n = input!!.toInt()
        var current = 0
        var k = 0L
        loop@ while (true) {
            k++
            var num = n * k
            while (num > 0) {
                val digit = (num % 10).toInt()
                current = current or (1 shl digit)
                num /= 10
                if (current == target) {
                    bw.appendLine("$k")
                    break@loop
                }
            }
        }
    }
    bw.close()
}