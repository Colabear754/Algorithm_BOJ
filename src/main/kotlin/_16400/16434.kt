package _16400

import java.util.StringTokenizer
import kotlin.math.ceil

fun main() = with(System.`in`.bufferedReader()) {
    var (n, atk) = readLine().split(' ').map { it.toLong() }
    var hp = 0L
    var max = 0L
    for (i in 1..n) {
        StringTokenizer(readLine()).apply {
            val t = nextToken()
            val a = nextToken().toLong()
            val h = nextToken().toLong()
            when (t) {
                "1" -> {
                    val damage = a * (ceil(h.toDouble() / atk) - 1).toLong()
                    if (damage > hp) {
                        max += damage - hp
                        hp = 0
                    } else {
                        hp -= damage
                    }
                }
                "2" -> {
                    atk += a
                    hp = minOf(hp + h, max)
                }
            }
        }
    }
    println(max + 1)
}