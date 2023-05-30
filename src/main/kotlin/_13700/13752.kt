package _13700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        repeat(readLine().toInt()) { bw.write("=") }
        bw.newLine()
    }
    bw.close()
}