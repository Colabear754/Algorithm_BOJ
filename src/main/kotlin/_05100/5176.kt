package _05100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (p, m) = readLine().split(' ').map { it.toInt() }
        val seats = BooleanArray(m + 1)
        var count = 0
        repeat(p) {
            val seat = readLine().toInt()
            if (seats[seat]) {
                count++
                return@repeat
            }
            seats[seat] = true
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}