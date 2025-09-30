package _26000

fun main() = with(System.`in`.bufferedReader()) {
    println(readLine().split(' ').map { it.toLong().ancestors }.reduce(Set<Long>::intersect).max())
}

private val Long.ancestors: Set<Long> get() {
    var n = this
    val ancestors = mutableSetOf(1L, n)
    var factor = 2L
    while (factor * factor <= n) {
        while (n % factor == 0L) {
            n /= factor
            ancestors.add(n)
        }
        factor++
    }
    return ancestors
}