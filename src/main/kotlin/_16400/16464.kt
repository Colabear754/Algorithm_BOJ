package _16400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val k = readLine().toInt()
        var n = 2
        var remain = 0
        while ((k - n * (n - 1) / 2).also { remain = it } > 0) {
            if (remain % n == 0) {
                return@repeat bw.write("Gazua\n")
            }
            n++
        }
        bw.write("GoHanGang\n")
    }
    bw.close()
}