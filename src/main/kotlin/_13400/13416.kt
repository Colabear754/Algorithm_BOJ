package _13400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var sum = 0
        repeat(readLine().toInt()) {
            java.util.StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }.max()
                .let { if (it > 0) sum += it }
        }
        bw.write("$sum")
        bw.newLine()
    }
    bw.close()
}