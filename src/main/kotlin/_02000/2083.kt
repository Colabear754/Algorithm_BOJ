package _02000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var s: String
    while (readLine().also { s = it } != "# 0 0") {
        val person = s.split(" ")
        bw.write(person[0] + if (person[1].toInt() > 17 || person[2].toInt() >= 80) " Senior\n" else " Junior\n")
    }
    bw.close()
}