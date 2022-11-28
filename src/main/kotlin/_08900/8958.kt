package _08900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val times = readLine().toInt()
    repeat(times) {
        val ox = readLine()
        var total = 0
        var score = 0
        for (i in 1..ox.lastIndex) {
            if (ox[i - 1] == 'O') {
                total += ++score
            }
            if (ox[i] == 'X') {
                score = 0
            }
        }
        if (ox.last() == 'O') {
            total += score + 1
        }
        bw.write("$total\n")
    }
    bw.close()
}