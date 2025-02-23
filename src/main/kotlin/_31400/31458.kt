package _31400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val formula = readLine()
        val index = formula.indexOfAny(charArrayOf('0', '1'))
        val forward = formula.take(index).length
        var value = formula[index] - '0'
        val backward = formula.substring(index + 1).length
        if (backward != 0) value = 1
        bw.write("${(forward + value) and 1}")
        bw.newLine()
    }
    bw.close()
}