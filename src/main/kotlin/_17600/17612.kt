package _17600

import java.util.StringTokenizer
import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val counters = PriorityQueue<Customer>()
    repeat(minOf(n, k)) {
        StringTokenizer(readLine()).apply { counters.add(Customer(nextToken().toInt(), nextToken().toInt(), it)) }
    }
    val exitCustomer = ArrayList<Customer>()
    for (i in k + 1..n) {
        counters.poll().apply {
            exitCustomer.add(this)
            StringTokenizer(readLine()).apply { counters.add(Customer(nextToken().toInt(), time + nextToken().toInt(), counter)) }
        }
    }
    repeat(counters.size) { exitCustomer.add(counters.poll()) }
    exitCustomer.sortWith(compareBy({ it.time }, { -it.counter }))
    var result = 0L
    exitCustomer.forEachIndexed { i, customer -> result += customer.id * (i + 1L) }
    println(result)
}

private class Customer(val id: Int, val time: Int, val counter: Int) : Comparable<Customer> {
    override fun compareTo(other: Customer) = if (time == other.time) counter - other.counter else time - other.time
}