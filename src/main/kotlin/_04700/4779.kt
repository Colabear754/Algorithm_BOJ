package _04700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var n: String?
    while (!readLine().also { n = it }.isNullOrEmpty()) {
        bw.write("${cantore(n!!.toInt())}\n")
    }
    bw.close()
}

private fun cantore(n: Int): StringBuilder {
    val sb = StringBuilder()
    if (n == 0) return sb.append('-')
    sb.append(cantore(n - 1))
        .append(" ".repeat(3.pow(n - 1)))
        .append(cantore(n - 1))
    return sb
}

private fun Int.pow(n: Int): Int {
    var result = 1
    repeat(n) { result *= this }
    return result
}