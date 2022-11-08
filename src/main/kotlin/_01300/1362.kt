package _01300

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var count = 0   // 시나리오 번호
    var s: String
    while (readln().also { s = it } != "0 0") { // 0 0이면 종료
        var (o, w) = s.split(" ").map { it.toInt() }
        var isDead = false  // 펫이 죽었는지 체크
        while (readln().also { s = it } != "# 0") {
            val (action, n) = s.split(" ")
            when (action) {
                "F" -> w += n.toInt()
                "E" -> w -= n.toInt()
            }
            if (w <= 0) {   // 펫이 죽어도 시나리오는 계속 진행되지만 죽었는지는 체크
                isDead = true
            }
        }
        bw.write("${++count} " +
            if (isDead)
                "RIP\n"
            else if (w in o / 2 + 1 until o * 2)
                ":-)\n"
            else
                ":-(\n"
        )
    }
    bw.flush()
    bw.close()
}