package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val cups = intArrayOf(1, 0, 0)
    for (c in readLine()) {
        when (c) {
            'A' -> cups.swap(0, 1)
            'B' -> cups.swap(1, 2)
            'C' -> cups.swap(0, 2)
        }
    }
    println(cups.indexOf(1) + 1)
}

private fun IntArray.swap(a: Int, b: Int) {
    val temp = this[a]
    this[a] = this[b]
    this[b] = temp
}