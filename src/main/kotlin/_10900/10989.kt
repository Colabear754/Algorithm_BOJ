package _10900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val numbers = IntArray(10001)
    repeat(readLine().toInt()) {
        numbers[readLine().toInt()]++
    }
    for (i in 1..10000) {
        repeat(numbers[i]) {
            bw.write("$i\n")
        }
    }
    bw.close()
}