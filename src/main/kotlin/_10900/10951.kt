package _10900

fun main() {
    val sb = StringBuilder()
    var input: String?
    while (readLine().also { input = it } != null) {
        sb.append("${input!!.sumOf { it.code } - 128}\n")
    }
    println(sb)
}