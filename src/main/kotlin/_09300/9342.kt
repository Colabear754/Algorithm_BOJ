package _09300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val regex = Regex("^[ABCDEF]?A+F+C+[ABCDEF]?")
    repeat(readLine().toInt()) {
        val str = readLine()
        bw.write(if (str.matches(regex)) "Infected!\n" else "Good\n")
    }
    bw.close()
}