package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var time: Int
        var playTime: Int
        StringTokenizer(readLine(), ": ").apply {
            time = nextToken().toInt() * 60 + nextToken().toInt()
            playTime = nextToken().toInt()
        }
        var charge = 0
        while (playTime > 0) {
            if ((time >= 1320 || time <= 180) && playTime >= 300) {
                while (time >= 1320 || time < 480) {
                    if (480 - time in 0..60) {
                        playTime -= 480 - time
                        time = 480
                    } else {
                        time += 60
                        time %= 1440
                        playTime -= 60
                    }
                }
                charge += 5000
            } else {
                time += 60
                playTime -= 60
                charge += 1000
            }
            time %= 1440
        }
        bw.write("$charge\n")
    }
    bw.close()
}