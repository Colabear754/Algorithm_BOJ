package _24300

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val stationDistance = mapOf(
        "Seoul" to 0.0,
        "Yeongdeungpo" to 9.1,
        "Anyang" to 23.9,
        "Suwon" to 41.5,
        "Osan" to 56.5,
        "Seojeongri" to 66.5,
        "Pyeongtaek" to 75.0,
        "Seonghwan" to 84.4,
        "Cheonan" to 96.6,
        "Sojeongni" to 107.4,
        "Jeonui" to 114.9,
        "Jochiwon" to 129.3,
        "Bugang" to 139.8,
        "Sintanjin" to 151.9,
        "Daejeon" to 166.3,
        "Okcheon" to 182.5,
        "Iwon" to 190.8,
        "Jitan" to 196.4,
        "Simcheon" to 200.8,
        "Gakgye" to 204.6,
        "Yeongdong" to 211.6,
        "Hwanggan" to 226.2,
        "Chupungnyeong" to 234.7,
        "Gimcheon" to 253.8,
        "Gumi" to 276.7,
        "Sagok" to 281.3,
        "Yangmok" to 289.5,
        "Waegwan" to 296.0,
        "Sindong" to 305.9,
        "Daegu" to 323.1,
        "Dongdaegu" to 326.3,
        "Gyeongsan" to 338.6,
        "Namseonghyeon" to 353.1,
        "Cheongdo" to 361.8,
        "Sangdong" to 372.2,
        "Miryang" to 381.6,
        "Samnangjin" to 394.1,
        "Wondong" to 403.2,
        "Mulgeum" to 412.4,
        "Hwamyeong" to 421.8,
        "Gupo" to 425.2,
        "Sasang" to 430.3,
        "Busan" to 441.7,
    )
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val timeTable = HashMap<String, Pair<Int, Int>>()
    repeat(n) {
        StringTokenizer(readLine()).apply { timeTable[nextToken()] = nextToken().toMinutes() to nextToken().toMinutes() }
    }
    repeat(q) {
        val (start, end) = StringTokenizer(readLine()).run { nextToken() to nextToken() }
        val time = (timeTable[end]!!.first - timeTable[start]!!.second + 1440) % 1440
        val distance = abs(stationDistance[end]!! - stationDistance[start]!!)
        bw.write("${(distance / time) * 60}\n")
    }
    bw.close()
}

private fun String.toMinutes() = if (this == "-:-") -1 else StringTokenizer(this, ":").run { nextToken().toInt() * 60 + nextToken().toInt() }