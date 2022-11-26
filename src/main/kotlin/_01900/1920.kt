package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var k = readLine().toInt()
    var st = StringTokenizer(readLine())
    val n = IntArray(k) { st.nextToken().toInt() }.sortedArray()
    k = readLine().toInt()
    st = StringTokenizer(readLine())
    repeat(k) {
        bw.write("${if (n.binarySearch(st.nextToken().toInt()) >= 0) 1 else 0}\n")
    }
    bw.close()
}