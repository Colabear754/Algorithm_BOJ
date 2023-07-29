package _05300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        when (n) {
            1 -> bw.write("#\n\n")
            2 -> bw.write("##\n##\n\n")
            else -> {
                bw.write("${"#".repeat(n)}\n")
                repeat(n - 2) { bw.write("#${"J".repeat(n - 2)}#\n") }
                bw.write("${"#".repeat(n)}\n\n")
            }
        }
    }
    bw.close()
}