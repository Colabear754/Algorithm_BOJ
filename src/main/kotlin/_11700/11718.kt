package _11700

fun main() {
    val bw = System.out.bufferedWriter()
    var str: String?
    while (!readLine().also { str = it }.isNullOrEmpty()) {
        bw.write("${str!!}\n")
    }
    bw.close()
}