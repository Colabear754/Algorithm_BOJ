package _07600

import java.util.StringTokenizer

fun main() = with(System.out.bufferedWriter()) {
    val st = StringTokenizer(readln(), ".?", true)
    while (st.hasMoreTokens()) {
        val str = "${st.nextToken().trim()}${st.nextToken().trim()}"
        if (str.length < 7) continue
        if (str.slice(0..6) == "What is" && str.last() == '?') {
            write("Forty-two${str.slice(4 until str.lastIndex)}.\n")
        }
    }
    close()
}