package _07500

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(' ').map { it.toInt() }
    var st: StringTokenizer
    val box = Array(n) { IntArray(m) }
    val queue: Queue<Position> = LinkedList()
    var unripeTomato = 0
    var day = 0
    repeat(n) { i ->
        st = StringTokenizer(readLine())
        repeat(m) { j ->
            box[i][j] = st.nextToken().toInt()
            if (box[i][j] == 1) queue.add(Position(i, j))
            else if (box[i][j] == 0) unripeTomato++
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
            if (box[x][y] > day) day = box[x][y]
            if (x > 0 && box[x - 1][y] == 0) {
                unripeTomato--
                queue.add(Position(x - 1, y))
                box[x - 1][y] = box[x][y] + 1
            }
            if (y > 0 && box[x][y - 1] == 0) {
                unripeTomato--
                queue.add(Position(x, y - 1))
                box[x][y - 1] = box[x][y] + 1
            }
            if (x < n - 1 && box[x + 1][y] == 0) {
                unripeTomato--
                queue.add(Position(x + 1, y))
                box.get(x + 1)[y] = box[x][y] + 1
            }
            if (y < m - 1 && box[x][y + 1] == 0) {
                unripeTomato--
                queue.add(Position(x, y + 1))
                box[x][y + 1] = box[x][y] + 1
            }
        }
    }
    if (unripeTomato != 0) println(-1)
    else println(day - 1)
}

class Position(var x: Int, var y: Int)