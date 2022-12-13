package _11000

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toInt() }
    val coins = Stack<Int>()
    var coinCnt = 0
    repeat(n) {
        readLine().toInt().let { n -> if (n <= k) coins.push(n) }
    }
    while (k > 0) {
        val currCoin = coins.peek() ?: 0
        val subCoinCnt = k / currCoin
        if (currCoin <= k) {
            k -= currCoin * subCoinCnt
            coinCnt += subCoinCnt
        }
        if (currCoin > k) coins.pop()
    }
    println(coinCnt)
}