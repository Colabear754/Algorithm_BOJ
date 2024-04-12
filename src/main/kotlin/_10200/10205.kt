package _10200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { i ->
        var heads = readLine().toInt()
        val dataSet = readLine()
        heads += dataSet.count { it == 'c' }
        heads -= dataSet.count { it == 'b' }
        bw.write("Data Set ${i + 1}:\n")
        bw.write("$heads")
        bw.write("\n\n")
    }
    bw.close()
}