package _10800

import java.util.StringTokenizer

fun main() = with(System.out.bufferedWriter()) {
    val br = System.`in`.bufferedReader()
    val (n, x) = br.readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(br.readLine())
    var a: Int
    repeat(n) {
        if (st.nextToken().toInt().also { a = it } < x)
            write("$a ")
    }
    close()
}