package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(3) {
        val number = readLine()
        var max = 1
        var current = 1
        var start = 0
        while (current < 8) {
            if (number[start] == number[current]) {
                current++
                max = maxOf(max, current - start)
                continue
            }
            start = current
            current++
        }
        bw.appendLine("$max")
    }
    bw.close()
}