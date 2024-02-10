package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val dwarves = IntArray(9) { readLine().toInt() }
    val sum = dwarves.sum()
    for (i in 0..<9) {
        for (j in i + 1..<9) {
            if (sum - dwarves[i] - dwarves[j] == 100) {
                println(dwarves.filterIndexed { index, _ -> index != i && index != j }.joinToString("\n"))
            }
        }
    }
}