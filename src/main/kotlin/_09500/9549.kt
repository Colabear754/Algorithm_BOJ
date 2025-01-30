package _09500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val password = readLine()
        val original = readLine()
        val passwordCount = IntArray(26)
        val originalCount = IntArray(26)
        for (i in original.indices) passwordCount[password[i] - 'a']++
        original.forEach { originalCount[it - 'a']++ }
        if (passwordCount.contentEquals(originalCount)) {
            bw.write("YES\n")
            return@repeat
        }
        for (i in 1..password.length - original.length) {
            passwordCount[password[i - 1] - 'a']--
            passwordCount[password[i + original.length - 1] - 'a']++
            if (passwordCount.contentEquals(originalCount)) {
                bw.write("YES\n")
                return@repeat
            }
        }
        bw.write("NO\n")
    }
    bw.close()
}