package _23300

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val stations = Subway().apply {
        var prev = 0
        st = StringTokenizer(readLine())
        repeat(n) {
            val temp = st.nextToken().toInt()
            addStation(prev, temp)
            prev = temp
        }
    }
    repeat(m) {
        st = StringTokenizer(readLine())
        val work = st.nextToken()
        val temp = st.nextToken().toInt()
        when (work) {
            "BN" -> {
                sb.append(stations.next[temp]).append('\n')
                stations.addStation(temp, st.nextToken().toInt())
            }

            "BP" -> {
                sb.append(stations.prev[temp]).append('\n')
                stations.addStation(stations.prev[temp], st.nextToken().toInt())
            }

            "CN" -> {
                sb.append(stations.next[temp]).append('\n')
                stations.removeStation(stations.next[temp])
            }

            "CP" -> {
                sb.append(stations.prev[temp]).append('\n')
                stations.removeStation(stations.prev[temp])
            }
        }
    }
    println(sb)
}

class Subway(val prev: IntArray = IntArray(1000001), val next: IntArray = IntArray(1000001)) {
    fun addStation(prev: Int, new: Int) {
        if (prev == 0) {
            this.prev[new] = next[new].also { next[new] = new }
            return
        }
        this.prev[new] = prev
        next[new] = next[prev]
        this.prev[next[prev]] = new
        next[prev] = new
    }

    fun removeStation(target: Int) {
        prev[next[target]] = prev[target]
        next[prev[target]] = next[target]
    }
}