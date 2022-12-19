package _14700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val students = DoubleArray(readLine().toInt()) { readLine().toDouble() }.sortedArray()
    repeat(7) { bw.write("%.3f\n".format(students[it])) }
    bw.close()
}