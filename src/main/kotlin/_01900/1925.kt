package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (x1, y1) = readLine().split(' ').map { it.toInt() }
    val (x2, y2) = readLine().split(' ').map { it.toInt() }
    val (x3, y3) = readLine().split(' ').map { it.toInt() }
    if ((x1 - x2) * (y1 - y3) == (y1 - y2) * (x1 - x3)) return@with println("X")
    val a = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)
    val b = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)
    val c = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)
    val (min, mid, max) = intArrayOf(a, b, c).apply { sort() }
    if (max == min) return@with println("JungTriangle")
    val pythagoras = max - min - mid
    bw.write(when {
        pythagoras > 0 -> "Dunkak"
        pythagoras < 0 -> "Yeahkak"
        else -> "Jikkak"
    })
    if (min == mid || max == mid) bw.write("2")
    bw.write("Triangle")
    bw.close()
}