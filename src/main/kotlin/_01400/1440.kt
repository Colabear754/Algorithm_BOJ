package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val time = readLine().split(":").map { it.toInt() }
    var count = 0
    for (i in time.indices) {
        for (j in time.indices) {
            for (k in time.indices) {
                if (i!=j && j!=k && k!=i) {
                    if (time[i] in 1..12 && time[j] in 0..59 && time[k] in 0..59) {
                        count++
                    }
                }
            }
        }
    }
    println(count)
}