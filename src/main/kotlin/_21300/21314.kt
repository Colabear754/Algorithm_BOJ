package _21300

fun main() = with(System.`in`.bufferedReader()) {
    val minkyeom = readLine()
    val max = StringBuilder()
    val min = StringBuilder()
    var maxM = 0
    var minM = 0
    for (c in minkyeom) {
        if (c == 'M') {
            maxM++
            minM++
            continue
        }
        max.append('5').append("0".repeat(maxM))
        maxM = 0
        if (minM > 0) {
            min.append('1').append("0".repeat(minM - 1))
            minM = 0
        }
        min.append('5')
    }
    max.append("1".repeat(maxM))
    if (minM > 0) {
        min.append('1').append("0".repeat(minM - 1))
    }
    println("$max\n$min")
}