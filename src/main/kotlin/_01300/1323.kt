package _01300

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toInt() }
    val length = n.toString().length
    var mul = 1L
    repeat(length) { mul *= 10 }
    mul %= k
    var count = 1
    val modSet = HashSet<Long>()
    var current = (n % k).also { n = it }.toLong()
    modSet.add(current)

    while (true) {
        if (current == 0L) break
        count++
        current *= mul
        current += n
        current %= k
        if (!modSet.add(current)) {
            println(-1)
            return@with
        }
    }
    println(count)
}