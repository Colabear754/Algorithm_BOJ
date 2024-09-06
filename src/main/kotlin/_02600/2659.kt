package _02600

fun main() = with(System.`in`.bufferedReader()) {
    val crossCard = readLine().replace(" ", "")
    val clockNumber = findClockNumber(crossCard)
    val smaller = HashSet<Int>()
    for (i in 1111..<clockNumber) {
        smaller.add(findClockNumber("$i"))
    }
    smaller.remove(-1)
    println(smaller.size + 1)
}

private fun findClockNumber(crossCard: String): Int {
    var clockNumber = 9999
    repeat(4) { i ->
        var current = crossCard[i] - '0'
        if (current == 0) return -1
        for (j in 1..3) {
            current = current * 10 + (crossCard[(i + j) % 4] - '0')
        }
        clockNumber = minOf(clockNumber, current)
    }
    return clockNumber
}