package _01000

import java.util.Stack
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (x, y, k) = readLine().split(' ').map { it.toInt() }
        val farm = Array(x) { BooleanArray(y) }
        repeat(k) {
            StringTokenizer(readLine()).run { farm[nextToken().toInt()][nextToken().toInt()] = true }
        }
        bw.write("${bugs(x, y, farm)}\n")
    }
    bw.close()
}

fun bugs(x: Int, y: Int, farm: Array<BooleanArray>): Int {
    var cnt = 0
    val stack = Stack<IntArray>()
    var cabbage: IntArray

    repeat(x) { i ->
        repeat(y) { j ->
            if (farm[i][j]) {
                cnt++
                stack.push(intArrayOf(i, j))

                while (stack.isNotEmpty()) {
                    cabbage = stack.pop()
                    farm[cabbage[0]][cabbage[1]] = false

                    if (cabbage[0] > 0 && farm[cabbage[0] - 1][cabbage[1]]) stack.push(intArrayOf(cabbage[0] - 1, cabbage[1]))
                    if (cabbage[0] < farm.lastIndex && farm[cabbage[0] + 1][cabbage[1]]) stack.push(intArrayOf(cabbage[0] + 1, cabbage[1]))
                    if (cabbage[1] > 0 && farm[cabbage[0]][cabbage[1] - 1]) stack.push(intArrayOf(cabbage[0], cabbage[1] - 1))
                    if (cabbage[1] < farm[cabbage[0]].lastIndex && farm[cabbage[0]][cabbage[1] + 1]) stack.push(intArrayOf(cabbage[0], cabbage[1] + 1))
                }
            }
        }
    }

    return cnt
}