package _18200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var stepCount = 2
    lateinit var str: String
    while (readLine().also { str = it } != "Was it a cat I saw?") {
        for (i in 0..str.lastIndex step stepCount) {
            bw.write("${str[i]}")
        }
        bw.newLine()
        stepCount++
    }
    bw.close()
}