package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val decimal = readLine()
    val integerPart = decimal.substringBefore('.').toLong()
    val decimalPart = decimal.substringAfter('.', "-1")
    if (decimalPart == "-1") {
        println("$decimal/1")
        return@with
    }
    val decimalLong = decimal.replace("[.()]".toRegex(), "").toLong()
    val loopStartIndex = decimalPart.indexOf('(')
    if (loopStartIndex == -1) {
        val denominator = "1${"0".repeat(decimalPart.length)}".toLong()
        val gcd = gcd(decimalLong, denominator)
        println("${decimalLong / gcd}/${denominator / gcd}")
        return@with
    }
    val loop = decimalPart.substring(loopStartIndex + 1, decimalPart.length - 1)
    val nonLoop = decimalPart.substring(0, loopStartIndex)
    val denominator = ("9".repeat(loop.length) + "0".repeat(nonLoop.length)).toLong()
    val numerator = decimalLong - "$integerPart$nonLoop".toLong()
    val gcd = gcd(numerator, denominator)
    println("${numerator / gcd}/${denominator / gcd}")
}

private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)