package _20500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = IntArray(n) { readLine().toInt() }.sortedArray().run { HashMap<Int, Int>().apply { forEachIndexed { i, v -> get(v) ?: put(v, i) } } }
    repeat(m) { bw.write("${map[readLine().toInt()] ?: -1}\n") }
    bw.close()
}