package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val count = IntArray(4)
    while (true) {
        val line = readLine() ?: break
        for (c in line) {
            when {
                c.isLowerCase() -> count[0]++
                c.isUpperCase() -> count[1]++
                c.isDigit() -> count[2]++
                else -> count[3]++
            }
        }
        bw.write("${count.joinToString(" ")}\n")
        count.fill(0)
    }
    bw.close()
}