package _02100

import java.text.SimpleDateFormat

fun main() = with(System.`in`.bufferedReader()) {
    val sdf = SimpleDateFormat("dd MM yyyy")
    val bw = System.out.bufferedWriter()
    var s: String
    while (readLine().also { s = it } != "0 0 0") {
        val year = s.split(" ")[2]
        bw.write("${(sdf.parse(s).time - sdf.parse("1 1 $year").time) / 1000 / 60 / 60 / 24 + 1}\n")
    }
    bw.close()
}