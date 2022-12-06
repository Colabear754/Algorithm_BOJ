package _02400

val bw = System.out.bufferedWriter()
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) { i ->
        repeat(n) { j ->
            star(i, j, n)
        }
        bw.write("\n")
    }
    bw.close()
}

fun star(i: Int, j: Int, n: Int) {
    when {
        n == 1 -> bw.write("*")
        ((i / (n / 3)) % 3) * ((j / (n / 3)) % 3) == 1 -> bw.write(" ")
        else -> star(i, j, n / 3)
    }
}