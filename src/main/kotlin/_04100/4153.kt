package _04100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var tri: List<Int>
    while (readLine().also { tri = it.split(' ').map { n -> n.toInt() }.sorted() } != "0 0 0") {
        bw.write(if (tri[0] * tri[0] + tri[1] * tri[1] == tri[2] * tri[2]) "right\n" else "wrong\n")
    }
    bw.close()
}