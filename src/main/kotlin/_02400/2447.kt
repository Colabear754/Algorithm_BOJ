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

fun star(w: Int, h: Int, n: Int) {
    when {
        n == 1 -> bw.write("*")
        ((w / (n / 3)) % 3) * ((h / (n / 3)) % 3) == 1 -> bw.write(" ")
        else -> star(w, h, n / 3)
    }
}