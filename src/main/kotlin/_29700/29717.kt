package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toLong()
        val experience = n * (n + 1) / 2
        var min = 0L
        var max = 1000000000L
        var level = 1L
        while (min <= max) {
            val mid = (min + max) / 2
            val need = mid * (mid + 1)
            when {
                need < experience -> level = maxOf(mid + 1, level).also { min = mid + 1 }
                need > experience -> max = mid - 1
                else -> {
                    level = mid + 1
                    break
                }
            }
        }
        bw.write("$level")
        bw.newLine()
    }
    bw.close()
}