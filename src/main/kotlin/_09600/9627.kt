package _09600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val words = Array(n) { readLine() }
    val length = words.sumOf { it.length } - 1
    for (i in 1..999) {
        val numberWord = numberToWord(i)
        if (i == length + numberWord.length) {
            println(words.apply { set(indexOf("$"), numberWord) }.joinToString(" "))
            return@with
        }
    }
}

private val ones = arrayOf("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
private val teens = arrayOf("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
private val tens = arrayOf("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

private fun numberToWord(num: Int): String {
    return when (num) {
        in 1..9 -> ones[num]
        in 10..19 -> teens[num - 10]
        in 20..99 -> tens[num / 10] + ones[num % 10]
        in 100..999 -> ones[num / 100] + "hundred" + if (num % 100 != 0) numberToWord(num % 100) else ""
        else -> ""
    }
}