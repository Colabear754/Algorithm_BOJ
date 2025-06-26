package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var max = 0
    val cases = IntArray(readLine().toInt()) { readLine().toInt().also { max = maxOf(max, it) } }
    val result = IntArray(max + 1)
    result[1] = 3
    for (i in 2..max) {
        var count = 0
        for (j in 1..<i) {
            if (gcd(i, j) == 1) count += 2
        }
        result[i] = count + result[i - 1]
    }
    cases.forEach { bw.write("${result[it]}\n") }
    bw.close()
}

private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)