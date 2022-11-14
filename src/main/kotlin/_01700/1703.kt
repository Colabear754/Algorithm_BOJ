package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var s: String
    while (readLine().also { s = it } != "0") {
        var leaf = 1
        val tree = s.split(" ").map { it.toInt() }
        for (i in 1 until tree.size step 2) {
            leaf = leaf * tree[i] - tree[i + 1]
        }
        bw.write("${leaf}\n")
    }
    bw.flush()
    bw.close()
}