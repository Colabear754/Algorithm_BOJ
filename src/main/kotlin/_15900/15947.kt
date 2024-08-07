package _15900

fun main() = with(System.`in`.bufferedReader()) {
    val song = arrayOf("sukhwan", "baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan")
    val n = readLine().toInt()
    println(when (n % 14) {
        3, 7, 11 -> if (n / 14 > 2) "tu+ru*${n / 14 + 2}" else "tururu" + "ru".repeat(n / 14)
        4, 8, 12 -> if (n / 14 > 3) "tu+ru*${n / 14 + 1}" else "turu" + "ru".repeat(n / 14)
        else -> song[n % 14]
    })
}