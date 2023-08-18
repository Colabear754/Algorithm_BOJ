package _03400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt().toString(2)
        for (i in n.indices.reversed()) {
            if (n[i] == '1') bw.write("${n.lastIndex - i} ")
        }
        bw.newLine()
    }
    bw.close()
}