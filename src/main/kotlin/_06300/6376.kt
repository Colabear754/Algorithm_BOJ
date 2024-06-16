package _06300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var factorial = 1.0
    var current = 0.0
    bw.write("n e\n")
    bw.write("- -----------\n")
    for (i in 0..9) {
        factorial *= if (i == 0) 1.0 else i.toDouble()
        current += 1 / factorial
        bw.write("$i ${when (i) {
                    0, 1 -> "%.0f".format(current)
                    2 -> "%.1f".format(current)
                    else -> "%.9f".format(current)
                }}\n")
    }
    bw.close()
}