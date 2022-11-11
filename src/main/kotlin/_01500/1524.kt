package _01500

fun main() {
    val bw = System.out.bufferedWriter()
    val n = readln().toInt()
    repeat(n) {
        readln()
        readln()
        val S = readln().split(" ").map { it.toInt() }.sortedDescending().toMutableList()
        val B = readln().split(" ").map { it.toInt() }.sortedDescending().toMutableList()
        bw.write(
            when {
                S[0] >= B[0] -> "S\n"
                else -> "B\n"
            }
        )
    }
    bw.flush()
    bw.close()
}