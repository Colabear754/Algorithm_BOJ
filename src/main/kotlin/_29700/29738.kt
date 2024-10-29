package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("Case #${it + 1}: ${when (readLine().toInt()) {
            in 0..25 -> "World Finals"
            in 26..1000 -> "Round 3"
            in 1001..4500 -> "Round 2"
            else -> "Round 1"
        }}\n")
    }
    bw.close()
}