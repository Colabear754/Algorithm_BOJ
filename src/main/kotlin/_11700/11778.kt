package _11700

fun main() = print(readln().split(' ').map { it.toLong() }.let { (a, b) -> fibonacci(gcd(a, b)) })

private val memory = HashMap<Long, Long>().also {
    it[0] = 0
    it[1] = 1
}

private fun fibonacci(n: Long): Long {
    return memory[n] ?: run {
        val isEven = n % 2 == 0L
        val f_n = fibonacci(n / 2)
        val f_m = fibonacci(n / 2 + if (isEven) -1 else 1)
        ((if (isEven) (f_n * (2 * f_m + f_n)) else (f_n * f_n + f_m * f_m)) % 1000000007).also { memory[n] = it }
    }
}

private fun gcd(a: Long, b: Long): Long = if (a % b == 0L) b else gcd(b, a % b)
