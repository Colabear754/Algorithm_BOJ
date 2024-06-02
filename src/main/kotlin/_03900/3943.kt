package _03900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var n = readLine().toInt()
        var max = n
        while (n != 1) {
            n = if (n and 1 == 0) n / 2 else n * 3 + 1
            max = maxOf(max, n)
        }
        bw.write("$max\n")
    }
    bw.close()
}