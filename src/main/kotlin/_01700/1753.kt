package _01700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (v, e) = readLine().split(' ').map { it.toInt() }
    val k = readLine().toInt()
    val list = Array(v + 1) { ArrayList<Trunk>() }
    repeat(e) { StringTokenizer(readLine()).apply { list[nextToken().toInt()].add(Trunk(nextToken().toInt(), nextToken().toInt())) } }
    val distance = IntArray(v + 1) { Int.MAX_VALUE }
    distance[k] = 0
    val visited = BooleanArray(v + 1)
    repeat(v) {
        var min = Int.MAX_VALUE
        var index = -1
        for (i in 1..v) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i]
                index = i
            }
        }
        if (index == -1) return@repeat
        visited[index] = true
        for (trunk in list[index]) {
            distance[trunk.vertex] = minOf(distance[trunk.vertex], distance[index] + trunk.distance)
        }
    }

    for (i in 1..v) {
        bw.write("${if (distance[i] == Int.MAX_VALUE) "INF" else distance[i]}\n")
    }
    bw.close()
}

private class Trunk(val vertex: Int, val distance: Int)