package _04100

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: StringTokenizer
    while (readLine().also { input = StringTokenizer(it) } != "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0") {
        val (ax, ay) = DoubleArray(2) { input.nextToken().toDouble() }
        val (bx, by) = DoubleArray(2) { input.nextToken().toDouble() }
        val (cx, cy) = DoubleArray(2) { input.nextToken().toDouble() }
        val (dx, dy) = DoubleArray(2) { input.nextToken().toDouble() }
        val (ex, ey) = DoubleArray(2) { input.nextToken().toDouble() }
        val (fx, fy) = DoubleArray(2) { input.nextToken().toDouble() }
        val acx = cx - ax
        val acy = cy - ay
        val baseAria = abs((bx - ax) * acy - (by - ay) * acx)
        val triangle = abs((dx - ex) * (fy - ey) - (dy - ey) * (fx - ex)) / 2.0
        val s = triangle / baseAria
        bw.write("%.3f %.3f %.3f %.3f\n".format(bx + s * acx, by + s * acy, ax + s * acx, ay + s * acy))
    }
    bw.close()
}