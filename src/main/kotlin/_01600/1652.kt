package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()
    val n = readLine().toInt()
    var hor = 0
    var ver = 0
    var count = 0
    val room = Array(n) {readLine()}
    for (i in room.indices) {
        count = 0
        for (j in room[i].indices) {
            when (room[i][j]) {
                'X' -> {
                    hor += if (count >= 2) 1 else 0
                    count = 0
                }
                else -> count++
            }
        }
        if (count >= 2) {
            hor++
        }
    }
    for (i in room.indices) {
        count = 0
        for (j in room[i].indices) {
            when (room[j][i]) {
                'X' -> {
                    ver += if (count >= 2) 1 else 0
                    count = 0
                }
                else -> count++
            }
        }
        if (count >= 2) {
            ver++
        }
    }
    br.write("$hor ${ver}\n")
    br.flush()
    br.close()
}