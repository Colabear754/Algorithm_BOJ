package _05300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val decimal = readLine()
        val loop = decimal.substringAfter('(', "-1").substringBefore(')', )
        if (loop == "-1") {
            val denominator = "1${"0".repeat(decimal.length - 2)}".toLong()
            val numerator = decimal.substring(2).toLong()
            val gcd = gcd(numerator, denominator)
            bw.write("${numerator / gcd}/${denominator / gcd}\n")
            return@repeat
        }
        val nonLoop = decimal.substringAfter('.').substringBefore('(')
        val denominator = ("9".repeat(loop.length) + "0".repeat(nonLoop.length)).toLong()
        val numerator = decimal.replace("[.()]".toRegex(), "").toLong() - "0$nonLoop".toLong()
        val gcd = gcd(numerator, denominator)
        bw.write("${numerator / gcd}/${denominator / gcd}\n")
    }
    bw.close()
}

private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)