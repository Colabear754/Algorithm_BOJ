package _02200

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(' ').map { it.toInt() }
    val meats = PriorityQueue<Meat>()
    repeat(n) { meats.add(StringTokenizer(readLine()).run { Meat(nextToken().toInt(), nextToken().toInt()) }) }
    var result = Int.MAX_VALUE
    var prevPrice = -1
    var totalPrice = 0
    while (meats.isNotEmpty()) {
        val meat = meats.poll()
        if (prevPrice != meat.price) {
            totalPrice = meat.price
        } else {
            totalPrice += meat.price
        }
        m -= meat.weight
        if (m <= 0) result = minOf(result, totalPrice)
        prevPrice = meat.price
    }
    println(if (m > 0) -1 else result)
}

class Meat(val weight: Int, val price: Int) : Comparable<Meat> {
    override fun compareTo(other: Meat): Int = if (this.price == other.price) other.weight - this.weight else this.price - other.price
}