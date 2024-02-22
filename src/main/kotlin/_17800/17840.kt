package _17800

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (q, m) = readLine().split(' ').map { it.toInt() }
    val fibonacci = intArrayOf(0, 1) + IntArray(maxOf(m * m))
    val sb = StringBuilder("01")
    for (i in 2..<fibonacci.size) {
        fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % m
        sb.append(fibonacci[i])
        if (fibonacci[i - 1] == 0 && fibonacci[i] == 1) {
            break
        }
    }
    val result = sb.slice(1..<sb.lastIndex)
    repeat(q) {
        val n = readLine().toLong()
        bw.write("${result[((n - 1) % result.length).toInt()]}")
        bw.newLine()
    }
    bw.close()
}