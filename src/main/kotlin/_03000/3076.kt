package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val (a, b) = readLine().split(' ').map { it.toInt() }
    repeat(r) { i ->
        repeat(a) {
            repeat(c) { j ->
                if ((i + j) % 2 == 0) bw.write("X".repeat(b))
                else bw.write(".".repeat(b))
            }
            bw.write("\n")
        }
    }
    bw.close()
}