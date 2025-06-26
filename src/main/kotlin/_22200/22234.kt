package _22200

import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, t, w) = readLine().split(' ').map { it.toInt() }
    val customers: Queue<Customer> = LinkedList()
    repeat(n) {
        StringTokenizer(readLine()).apply {
            customers.add(Customer(nextToken().toInt(), nextToken().toInt(), 0))
        }
    }
    val newCustomers = PriorityQueue<Customer>().apply {
        repeat(readLine().toInt()) {
            StringTokenizer(readLine()).apply {
                add(Customer(nextToken().toInt(), nextToken().toInt(), nextToken().toInt()))
            }
        }
    }
    var currentTime = 0
    while (currentTime < w) {
        val customer = customers.poll()
        if (customer.needTime > t) {
            repeat(minOf(t, w - currentTime)) { bw.write("${customer.id}\n") }
            currentTime += t
            customer.needTime -= t
        } else {
            repeat(minOf(customer.needTime, w - currentTime)) { bw.write("${customer.id}\n") }
            currentTime += customer.needTime
            customer.needTime = 0
        }

        while (newCustomers.isNotEmpty() && newCustomers.peek().enterTime <= currentTime) {
            customers.add(newCustomers.poll())
        }

        if (customer.needTime > 0) {
            customers.add(customer)
        }
    }
    bw.close()
}

private class Customer(val id: Int, var needTime: Int, val enterTime: Int): Comparable<Customer> {
    override fun compareTo(other: Customer) = this.enterTime - other.enterTime
}