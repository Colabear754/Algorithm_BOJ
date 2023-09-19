package _03400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var s: String?
    while (readLine().also { s = it } != null) {
        while (s!!.contains("BUG")) s = s!!.replace("BUG", "")
        bw.write("$s\n")
    }
    bw.close()
}