package _05000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val phoneNumbers = Array(n) { readLine() }
        phoneNumbers.sort()
        for (i in 0..<n - 1) {
            if (phoneNumbers[i + 1].startsWith(phoneNumbers[i])) {
                bw.write("NO\n")
                return@repeat
            }
        }
        bw.write("YES\n")
    }
    bw.close()
}