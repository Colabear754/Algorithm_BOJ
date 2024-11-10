package _05200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val pairs = Array(13) { mutableListOf<Pair<Int, Int>>() }
    for (i in 3..12) {
        for (j in 1..i / 2) {
            if (j == i - j) continue
            pairs[i].add(j to i - j)
        }
    }
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        bw.write("Pairs for $n: ")
        bw.write(pairs[n].joinToString(", ") { "${it.first} ${it.second}" })
        bw.newLine()
    }
    bw.close()
}