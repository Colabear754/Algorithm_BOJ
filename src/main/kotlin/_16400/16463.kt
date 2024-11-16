package _16400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 0
    for (i in 2019..n) {
        for (j in 1..12) {
            var epochDay = 365 * i + (i + 3) / 4 - (i + 99) / 100 + (i + 399) / 400 + (367 * j - 362) / 12 - 737424
            if (j > 2) {
                epochDay--
                if (((i and 3) != 0) || ((i % 100) == 0 && (i % 400) != 0)) epochDay--
            }
            if ((epochDay + 12) % 7 == 4) count++
        }
    }
    println(count)
}