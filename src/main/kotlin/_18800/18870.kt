package _18800

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = IntArray(n)
    val st = StringTokenizer(readLine())
    val pq = PriorityQueue<Int>()
    val map = HashMap<Int, Int>()
    var cnt = 0
    repeat(n) {
        st.nextToken().toInt().let { num -> arr[it] = num; pq.add(num) }
    }
    while (pq.isNotEmpty()) {
        pq.poll().let { num -> if (!map.contains(num)) map[num] = cnt++ }
    }
    repeat(n) {
        bw.write("${map[arr[it]]} ")
    }
    bw.close()
}