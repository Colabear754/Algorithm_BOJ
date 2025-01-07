package _02000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var networkBit = 0xffffffff
    val ipBits = Array(n) { StringTokenizer(readLine(), ".").run {
        val ip = LongArray(4) { nextToken().toLong() }
        ((ip[0] shl 24) or (ip[1] shl 16) or (ip[2] shl 8) or ip[3]).also { networkBit = networkBit and it }
    } }
    val prefixLength = (0..31).find { bit -> (1L shl (31 - bit)).run { ipBits.any { networkBit and this != it and this } } } ?: 32
    val subnetMaskBit = 0xffffffff shl (32 - prefixLength)
    println("${(networkBit and subnetMaskBit).ipAddress}\n${subnetMaskBit.ipAddress}")
}

private val Long.ipAddress get() = (0..3).joinToString(".") { "${this shr (24 - it * 8) and 0xff}" }