package _03100

fun main() = with(System.`in`.bufferedReader()) {
    val ipv6 = readLine().run { replace("::", ":".repeat(10 - split(":").size)) }
    println(ipv6.split(':').joinToString(":") { it.padStart(4, '0') })
}