package _09900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var case = 1
    val input = Array(2) { "" }
    val count = IntArray(26)
    while (true) {
        input[0] = readLine()
        input[1] = readLine()
        if (input[0] == "END" && input[1] == "END") {
            break
        }
        input[0].forEach { count[it - 'a']++ }
        input[1].forEach { count[it - 'a']-- }
        bw.write("Case ${case++}: ${if (count.all { it == 0 }) "same" else "different"}\n")
        count.fill(0)
    }
    bw.close()
}