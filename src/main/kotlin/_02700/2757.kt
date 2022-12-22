package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var RC: List<String>
    while (readLine().also { RC = it.split('R', 'C') } != "R0C0") {
        val r = RC[1].toInt()
        var c = RC[2].toInt()
        val sb = StringBuilder()
        while (c > 0) {
            c--
            sb.append('A' + c % 26)
            c /= 26
        }
        bw.write("${sb.reverse()}$r\n")
    }
    bw.close()
}