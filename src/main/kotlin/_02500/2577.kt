package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    val result = (a * b * c).toString()
    for (i in 0..9) {
        bw.write("${result.count { it == (48 + i).toChar() }}\n")
    }
    bw.close()
}