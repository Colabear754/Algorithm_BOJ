package _02000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val times = readLine().toInt()
    repeat(times) {
        val n = readLine().toInt()
        val pow = (n * n).toString()
        val length = n.toString().length
        val result = pow.substring(pow.length - length, pow.length)
        bw.write(if (result == n.toString()) "YES\n" else "NO\n")
    }
    bw.close()
}