package _02300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input: String
    while (readLine().also { input = it } != "#") {
        val c = input[0]
        bw.write("$c ${input.substring(2).lowercase().count { it == c }}")
        bw.newLine()
    }
    bw.close()
}