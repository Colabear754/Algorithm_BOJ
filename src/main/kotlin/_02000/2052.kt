package _02000

import java.math.BigDecimal

fun main() {
    val n = readln().toInt()
    var result = "%.300f".format(BigDecimal(0.5).pow(n))
    var i = result.lastIndex
    while (true) {
        if (result[i] != '0') {
            result = result.substring(0, i + 1)
            println(result)
            return
        }
        i--
    }
}