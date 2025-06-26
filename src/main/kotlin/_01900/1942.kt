package _01900

import java.text.SimpleDateFormat

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val sdf = SimpleDateFormat("HH:mm:ss")
    repeat(3) {
        val time = readLine().split(" ").map { sdf.parse(it).time / 1000 % (24 * 3600) }.toMutableList()
        var count = 0
        while (true) {
            if (getTimeNum(time[0]) % 3 == 0L) count++
            if (time[0] == time[1]) break
            time[0]++
            time[0] = time[0] % (24 * 3600)
        }
        bw.write("${count}\n")
    }
    bw.flush()
    bw.close()
}

private fun getTimeNum(time: Long) = (time / 3600) % 60 * 10000 + (time / 60) % 60 * 100 + time % 60