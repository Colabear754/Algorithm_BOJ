package _11100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val charCounts = IntArray(26)
        readLine().forEach { charCounts[it - 'A']++ }
        repeat(readLine().toInt()) inner@ {
            val wordCounts = IntArray(26)
            readLine().forEach { wordCounts[it - 'A']++ }
            for (i in 0..25) {
                if (wordCounts[i] > charCounts[i]) {
                    return@inner bw.write("NO\n")
                }
            }
            bw.write("YES\n")
        }
    }
    bw.close()
}