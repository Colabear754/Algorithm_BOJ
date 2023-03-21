package _22200

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val gorilla = HashMap<String, PriorityQueue<Int>>()
    var price = 0L
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> {
                    val name = nextToken()
                    repeat(nextToken().toInt()) {
                        gorilla[name]?.add(nextToken().toInt()) ?: run {
                            gorilla[name] = PriorityQueue<Int>(reverseOrder()).apply { add(nextToken().toInt()) }
                        }
                    }
                }
                "2" -> {
                    val name = nextToken()
                    repeat(minOf(nextToken().toInt(), gorilla[name]?.size ?: 0)) { price += gorilla[name]!!.poll() }
                }
            }
        }
    }
    println(price)
}