package _10100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val str = readLine().lowercase()
        var isPalindrome = true
        for (i in 0..str.lastIndex / 2) {
            if (str[i] != str[str.lastIndex - i]) {
                isPalindrome = false
                break
            }
        }
        bw.write(if (isPalindrome) "Yes\n" else "No\n")
    }
    bw.close()
}