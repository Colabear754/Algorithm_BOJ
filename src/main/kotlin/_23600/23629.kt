package _23600

import java.lang.NumberFormatException
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val expression = readLine().stringToNum()
    val st = StringTokenizer(expression, "+-x/=", true)
    val numbers: Queue<Long> = LinkedList()
    val operator: Queue<String> = LinkedList()
    while (st.hasMoreTokens()) {
        st.nextToken().also {
            when (it) {
                "+", "-", "x", "/", "=" -> operator.add(it)
                else -> numbers.add(
                    try {
                        it.toLong()
                    } catch (e: NumberFormatException) {
                        println("Madness!")
                        return@with
                    }
                )
            }
        }

    }
    if (numbers.size != operator.size) {
        println("Madness!")
        return@with
    }
    var result = numbers.poll()
    while (operator.isNotEmpty()) {
        when (operator.poll()) {
            "+" -> result += numbers.poll()
            "-" -> result -= numbers.poll()
            "x" -> result *= numbers.poll()
            "/" -> result /= numbers.poll()
        }
    }
    bw.write("$expression\n")
    bw.write(result.toString().numToString())
    bw.close()
}

fun String.stringToNum() = this
    .replace("ONE", "1")
    .replace("TWO", "2")
    .replace("THREE", "3")
    .replace("FOUR", "4")
    .replace("FIVE", "5")
    .replace("SIX", "6")
    .replace("SEVEN", "7")
    .replace("EIGHT", "8")
    .replace("NINE", "9")
    .replace("ZERO", "0")

fun String.numToString() = this
    .replace("1", "ONE")
    .replace("2", "TWO")
    .replace("3", "THREE")
    .replace("4", "FOUR")
    .replace("5", "FIVE")
    .replace("6", "SIX")
    .replace("7", "SEVEN")
    .replace("8", "EIGHT")
    .replace("9", "NINE")
    .replace("0", "ZERO")