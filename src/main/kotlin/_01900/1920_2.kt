package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var k = readLine().toInt()
    var st = StringTokenizer(readLine())
    val set = HashSet<Int>()
    repeat(k) {
        set.add(st.nextToken().toInt())
    }
    k = readLine().toInt()
    st = StringTokenizer(readLine())
    repeat(k) {
        bw.write("${if (set.contains(st.nextToken().toInt())) 1 else 0}\n")
    }
    bw.close()
}