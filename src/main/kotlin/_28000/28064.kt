package _28000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val names = Array(n) { readLine() }
    var count = 0
    for (i in names.indices) {
        for (j in i + 1..<names.size) {
            val minLength = minOf(names[i].length, names[j].length)
            val suffix1 = StringBuilder()
            val suffix2 = StringBuilder()
            for (k in 0..<minLength) {
                suffix1.append(names[i][k])
                suffix2.append(names[j][k])
                if (names[i].endsWith(suffix2) || names[j].endsWith(suffix1)) {
                    count++
                    break
                }
            }
        }
    }
    println(count)
}