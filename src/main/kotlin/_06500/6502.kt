package _06500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input: StringTokenizer
    var index = 1
    while (readLine().also { input = StringTokenizer(it) } != "0") {
        val r = input.nextToken().toInt()
        val w = input.nextToken().toInt()
        val l = input.nextToken().toInt()
        bw.write("Pizza ${index++} ${if (r * r * 4 >= w * w + l * l) "fits on the table." else "does not fit on the table."}\n")
    }
    bw.close()
}