package _05900

import kotlin.system.exitProcess

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    moo(n, 1, 3)
}

private fun moo(n: Int, k: Int, length: Int): Unit = when(n) {
    1 -> printAndExit('m')
    2, 3 -> printAndExit('o')
    else -> {
        val newLength = length * 2 + k + 3
        if (newLength < n) moo(n, k + 1, newLength)
        else if (n in length + 1..length + k + 3) {
            if (n - length == 1) printAndExit('m')
            else printAndExit('o')
        }
        else moo(n - length - k - 3, 1, 3)
    }
}

private fun printAndExit(c: Char) {
    println(c)
    exitProcess(0)
}