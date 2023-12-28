package _04400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val name = readLine()
        val g = name.count { it == 'g' || it == 'G' }
        val b = name.count { it == 'b' || it == 'B' }
        bw.write("$name is ${if (g > b) "GOOD" else if (g < b) "A BADDY" else "NEUTRAL"}\n")
    }
    bw.close()
}