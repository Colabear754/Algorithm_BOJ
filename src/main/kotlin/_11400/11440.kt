package _11400

fun main() = print(readln().toLong().let { (fibonacci(it) * fibonacci(it + 1)) % 1000000007 })

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