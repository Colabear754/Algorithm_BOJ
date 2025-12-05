package _18100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val usedSkills = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val deck = IntDeque(n)
    var current = 1
    for (i in n - 1 downTo 0) {
        when (usedSkills[i]) {
            1 -> deck.addFirst(current++)
            2 -> deck.addSecond(current++)
            3 -> deck.addLast(current++)
        }
    }
    println(deck)
}

private class IntDeque(capacity: Int) {
    private val data = IntArray(capacity)
    private var top = 0
    private var bottom = 0
    private var size = 0

    fun addFirst(value: Int) {
        top = (top - 1 + data.size) % data.size
        data[top] = value
        size++
    }

    fun addLast(value: Int) {
        data[bottom] = value
        bottom = (bottom + 1) % data.size
        size++
    }

    fun addSecond(value: Int) {
        val first = data[top]
        top = (top + 1) % data.size
        size--
        addFirst(value)
        addFirst(first)
    }

    override fun toString(): String {
        val builder = StringBuilder()
        for (i in 0..<size) {
            builder.append(data[(bottom + i) % data.size]).append(" ")
        }
        return builder.toString().trim()
    }
}