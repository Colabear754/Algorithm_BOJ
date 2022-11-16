package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val t = readLine().toInt()
    repeat(t) {
        val n = readLine().toInt()
        var count = 0

        // n을 초과하는 진법은 무의미하므로 n진법까지만 진행
        for (i in 2..n) {
            count += find_0(n, i)
        }
        bw.write("${count}\n")
    }
    bw.close()
}
// d진법의 맨 끝 0의 개수 = 연속으로 d로 나누어 떨어지는 횟수
fun find_0(n: Int, d: Int): Int {
    var num = n
    var count = 0
    while (num > 0) {
        if (num % d == 0) count++
        else break
        num /= d
    }
    return count
}