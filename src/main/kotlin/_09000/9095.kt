package _09000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = IntArray(12)
    cases[1] = 1.also { cases[2] = it.also { cases[3] = it } }
    for (i in 2..11) for (j in -1 downTo -3) if (i + j > 0) cases[i] += cases[i + j]
    repeat(readLine().toInt()) {
        bw.write("${cases[readLine().toInt()]}\n")
    }
    bw.close()
}