package _07500

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n, h) = readLine().split(' ').map { it.toInt() }
    var st: StringTokenizer
    val box = Array(n) { Array(m) { IntArray(h) } }
    val queue: Queue<Position2> = LinkedList()
    var unripeTomato = 0
    var day = 0
    repeat (h) { k ->
        repeat(n) { i ->
            st = StringTokenizer(readLine())
            repeat(m) { j ->
                box[i][j][k] = st.nextToken().toInt()
                if (box[i][j][k] == 1) queue.add(Position2(i, j, k))
                else if (box[i][j][k] == 0) unripeTomato++
            }
        }
    }
    if (queue.isEmpty()) {
        println(-1)
        return@with
    }
    else if (unripeTomato == 0) {
        println(0)
        return@with
    }
    while (queue.isNotEmpty()) {
        queue.poll().also {
            val x = it.x
            val y = it.y
            val z = it.z
            if (box[x][y][z] > day) day = box[x][y][z]
            if (x > 0 && box[x - 1][y][z] == 0) {
                unripeTomato--
                queue.add(Position2(x - 1, y, z))
                box[x - 1][y][z] = box[x][y][z] + 1
            }
            if (y > 0 && box[x][y - 1][z] == 0) {
                unripeTomato--
                queue.add(Position2(x, y - 1, z))
                box[x][y - 1][z] = box[x][y][z] + 1
            }
            if (z > 0 && box[x][y][z - 1] == 0) {
                unripeTomato--
                queue.add(Position2(x, y, z - 1))
                box[x][y][z - 1] = box[x][y][z] + 1
            }
            if (x < n - 1 && box[x + 1][y][z] == 0) {
                unripeTomato--
                queue.add(Position2(x + 1, y, z))
                box[x + 1][y][z] = box[x][y][z] + 1
            }
            if (y < m - 1 && box[x][y + 1][z] == 0) {
                unripeTomato--
                queue.add(Position2(x, y + 1, z))
                box[x][y + 1][z] = box[x][y][z] + 1
            }
            if (z < h - 1 && box[x][y][z + 1] == 0) {
                unripeTomato--
                queue.add(Position2(x, y, z + 1))
                box[x][y][z + 1] = box[x][y][z] + 1
            }
        }
    }
    if (unripeTomato != 0) println(-1)
    else println(day - 1)
}

class Position2(val x: Int, val y: Int, val z: Int)