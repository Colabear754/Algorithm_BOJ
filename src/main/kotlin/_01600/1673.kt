package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var s: String?
    while (!readLine().also { s = it }.isNullOrBlank()) {
        var (n, k) = s!!.split(" ").map { it.toInt() }
        var chicken = 0 // 먹은 치킨 수
        var stamp = 0   // 쿠폰으로 교환하고 남은 도장 수
        while (n > 0) {
            chicken += n
            n = (n + stamp) / k
            stamp = chicken % k
        }
        bw.write("${chicken}\n")
    }
    bw.flush()
    bw.close()
}