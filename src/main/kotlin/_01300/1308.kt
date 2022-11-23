package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val today = readLine().split(" ").map { it.toInt() }
    val d_day = readLine().split(" ").map { it.toInt() }
    println(
        if (d_day[0] - today[0] > 1000 || (d_day[0] - today[0] >= 1000 && (getDay(0, d_day[1], d_day[2]) >= getDay(0, today[1], today[2]))))
            "gg"
        else
            "D-${getDay(d_day[0], d_day[1], d_day[2]) - getDay(today[0], today[1], today[2])}")
}

private fun isLeap(year: Int) = if (year % 400 == 0) true else if (year % 100 == 0) false else year % 4 == 0

private fun getDay(y: Int, m: Int, d: Int): Int {
    var result = 0
    for (i in 1 until y) {
        result += if (isLeap(i)) 366 else 365
    }
    for (i in 1 until m) {
        result += if (i == 2 && isLeap(y)) 29 else month[i - 1]
    }
    return (result + d)
}

private val month = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)