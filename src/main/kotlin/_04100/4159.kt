package _04100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var n: Int
    case@ while (readLine().toInt().also { n = it } != 0) {
        val powerStations = IntArray(n) { readLine().toInt() }.sortedArray()
        for (i in 1..<n) {
            if (powerStations[i] - powerStations[i - 1] > 200) {
                bw.write("IMPOSSIBLE\n")
                continue@case
            }
        }
        if (powerStations.last() < 1322) {
            bw.write("IMPOSSIBLE\n")
            continue
        }
        bw.write("POSSIBLE\n")
    }
    bw.close()
}