package _15900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = Array(100001) { LongArray(2) }
    cases[1] = longArrayOf(1, 0)
    cases[2] = longArrayOf(1, 1)
    cases[3] = longArrayOf(2, 2)
    for (i in 4..100000) {
        cases[i][0] = (cases[i - 1][1] + cases[i - 2][1] + cases[i - 3][1]) % 1000000009
        cases[i][1] = (cases[i - 1][0] + cases[i - 2][0] + cases[i - 3][0]) % 1000000009
    }
    repeat(readLine().toInt()) {
        bw.write(cases[readLine().toInt()].joinToString(" "))
        bw.newLine()
    }
    bw.close()
}