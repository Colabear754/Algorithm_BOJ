package _06500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val fibonacci = IntArray(23)
    fibonacci[1] = 1
    fibonacci[2] = 2
    for (i in 3..<23) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }
    repeat(readLine().toInt()) {
        var n = readLine().toInt()
        val bits = mutableListOf<Int>()
        for (i in 22 downTo 0) {
            if (n >= fibonacci[i]) n -= fibonacci[i].also { bits.add(i) }
            if (n == 0) break
        }
        bw.write("${bits.sumOf { fibonacci[it - 1] }}")
        bw.newLine()
    }
    bw.close()
}