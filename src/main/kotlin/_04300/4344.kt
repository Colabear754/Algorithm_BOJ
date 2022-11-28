package _04300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val c = readLine().toInt()
    repeat(c) {
        val st = StringTokenizer(readLine())
        val n = st.nextToken().toInt()
        val stu = DoubleArray(n) { st.nextToken().toDouble() }
        val avg = stu.sum() / n
        bw.write("${"%.3f".format(stu.count { it > avg }.toDouble() / n * 100)}%\n")
    }
    bw.close()
}