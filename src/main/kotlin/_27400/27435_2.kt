package _27400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${padovan(readLine().toLong())}\n")
    }
    bw.close()
}

private val memory = HashMap<Long, Long>().also {
    it[-1] = 1
    it[0] = 0
    it[1] = 1
}

private fun padovan(n: Long): Long {
    return memory[n] ?: run {
        val half = n / 2
        val p_n = padovan(half)
        val p_n_1 = padovan(half - 1)
        val p_n_2 = padovan(half - 2)
        ((if (n % 2 == 0L) p_n_2 * p_n_2 + 2 * p_n_1 * p_n else p_n_1 * (p_n_1 + 2 * p_n_2) + p_n * p_n) % 998244353).also { memory[n] = it }
    }
}