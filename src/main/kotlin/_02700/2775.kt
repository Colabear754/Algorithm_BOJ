package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val k = readLine().toInt()
        val n = readLine().toInt()
        val people = Array(15) { IntArray(15) { it } }

        for (i in 1..k) {
            for (j in 2..n) {
                people[i][j] = people[i][j - 1] + people[i - 1][j]
            }
        }

        bw.write("${people[k][n]}\n")
    }
    bw.close()
}