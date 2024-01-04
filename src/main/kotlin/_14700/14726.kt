package _14700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val card = readLine()
        var sum = 0
        for (i in card.indices.reversed()) {
            val n = card[i] - '0'
            sum += if (i % 2 == 0) n * 2 / 10 + n * 2 % 10 else n
        }
        bw.write(if (sum % 10 == 0) "T\n" else "F\n")
    }
    bw.close()
}