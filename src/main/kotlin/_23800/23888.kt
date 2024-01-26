package _23800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (a, d) = readLine().split(' ').map { it.toLong() }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val query = nextToken()
            val (l, r) = LongArray(2) { nextToken().toLong() }
            when (query) {
                "1" -> bw.write("${(2 * a + (l + r - 2) * d) * (r - l + 1) / 2}")
                "2" -> bw.write(if (l == r) "${a + (l - 1) * d}" else "${gcd(a, d)}")
            }
        }
        bw.write("\n")
    }
    bw.close()
}

private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)