package _05500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val stu = IntArray(28) { readLine().toInt() }
    for (i in 1..30) {
        if (i !in stu) {
            bw.write("$i\n")
        }
    }
    bw.close()
}