package _11600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var max = 0
        var sum = 0
        val candidates = IntArray(readLine().toInt()) {
            readLine().toInt().also { n ->
                max = maxOf(max, n)
                sum += n
            }
        }
        when (candidates.count { it == max }) {
            1 -> bw.write("${if (max > sum / 2) "majority" else "minority"} winner ${candidates.indexOf(max) + 1}\n")
            else -> bw.write("no winner\n")
        }
    }
    bw.close()
}