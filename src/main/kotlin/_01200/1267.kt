package _01200

fun main() {
    readln()
    val tel = readln().split(" ").map { it.toInt() }
    var y = 0
    var m = 0
    for (i in tel.indices) {
        y += 10 * (tel[i] / 30 + 1)
        m += 15 * (tel[i] / 60 + 1)
    }

    print(if (y < m) "Y $y" else if (m < y) "M $m" else "Y M $y")
}