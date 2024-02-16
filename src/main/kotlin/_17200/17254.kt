package _17200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val inputs = ArrayList<Input>()
    repeat(m) {
        StringTokenizer(readLine()).apply { inputs.add(Input(nextInt(), nextInt(), nextToken())) }
    }
    inputs.sort()
    println(inputs.joinToString("") { it.char })
}

private fun StringTokenizer.nextInt() = nextToken().toInt()

private class Input(val index: Int, val time: Int, val char: String) : Comparable<Input> {
    override fun compareTo(other: Input) = if (time == other.time) index - other.index else time - other.time
}