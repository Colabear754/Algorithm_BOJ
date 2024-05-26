package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(3) {
        val arr = readLine()
        when (arr.count { it == '0' }) {
            1 -> bw.write("A\n")
            2 -> bw.write("B\n")
            3 -> bw.write("C\n")
            4 -> bw.write("D\n")
            else -> bw.write("E\n")
        }
    }
    bw.close()
}