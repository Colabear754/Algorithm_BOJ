package _12700

fun main() = with(System.`in`.bufferedReader()) {
    val (w, h) = readLine().split(' ').map { it.toInt() - 1 }
    val (x, y) = readLine().split(' ').map { it.toInt() - 1 }
    val toToast = comb(x + y, y)
    val toastToSchool = comb(w - x + h - y, h - y)
    println((toToast * toastToSchool) % 1000007)
}

fun comb(n: Int, k: Int): Long {
    var a = n
    val b = minOf(k, n - k)
    var result = 1.toBigInteger()
    var kFac = 1.toBigInteger()
    repeat(b) {
        result = result.multiply(a--.toBigInteger())
    }
    for (i in 2..b) {
        kFac = kFac.multiply(i.toBigInteger())
    }
    return result.divide(kFac).mod(1000007.toBigInteger()).toLong()
}