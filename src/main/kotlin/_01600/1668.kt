package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val trophies = IntArray(n) { readLine().toInt() }
    var left = 0
    var right = 0
    var maxL = 0
    var maxR = 0
    for (i in trophies.indices) {
        if (maxL < trophies[i]) {
            maxL = maxOf(maxL, trophies[i])
            left++
        }
        if (maxR < trophies[trophies.lastIndex - i]) {
            maxR = maxOf(maxR, trophies[trophies.lastIndex - i])
            right++
        }
    }
    bw.write("${left}\n${right}\n")
    bw.flush()
}