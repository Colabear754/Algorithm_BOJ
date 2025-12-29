package _25400

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val string = readLine()
    val counts = LongArray(4)
    for (char in string) {
        when (char) {
            'D' -> counts[0]++
            'K' -> counts[1] += counts[0]
            'S' -> counts[2] += counts[1]
            'H' -> counts[3] += counts[2]
        }
    }
    println(counts.last())
}