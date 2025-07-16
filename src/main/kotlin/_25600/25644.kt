package _25600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    StringTokenizer(readLine()).run {
        var minStock = nextToken().toInt()
        var maxStock = 0
        while (hasMoreTokens()) {
            val stock = nextToken().toInt()
            minStock = minOf(minStock, stock)
            maxStock = maxOf(maxStock, stock - minStock)
        }
        println(maxStock)
    }
}