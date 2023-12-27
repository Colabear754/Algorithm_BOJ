package _09900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val pattern = readLine()
    repeat(n) {
        val fileName = readLine()
        val prefix = pattern.substringBefore("*")
        val suffix = pattern.substringAfter("*")
        if (fileName.startsWith(prefix) && fileName.endsWith(suffix) && fileName.length >= pattern.length - 1) {
            bw.write("DA\n")
        } else {
            bw.write("NE\n")
        }
    }
    bw.close()
}