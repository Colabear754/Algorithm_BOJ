package _13400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val string = readLine().run { if (length and 1 == 0) this else repeat(2) }
        val length = string.length
        for (i in 0..<length step 2) bw.write("${string[i]}")
        bw.newLine()
        for (i in 1..<length step 2) bw.write("${string[i]}")
        bw.newLine()
    }
    bw.close()
}