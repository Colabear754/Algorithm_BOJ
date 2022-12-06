package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val arr = Array(9) { readLine().split(' ').map { it.toInt() } }
    val max = arr.maxOf { it.maxOrNull()!! }
    bw.write("${max}\n")
    bw.write("${arr.indexOf(arr.filter { it.contains(max) }[0]) + 1} ${arr.filter { it.contains(max) }[0].indexOf(max) + 1}\n")
    bw.close()
}