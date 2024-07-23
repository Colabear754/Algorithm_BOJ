package _23300

fun main() = with(System.`in`.bufferedReader()) {
    val photo = Array(5) { readLine() }
    val length = photo[0].length
    val result = Array(5) { StringBuilder() }
    for (i in 0..<length) {
        val student = (0..4).joinToString("") { "${photo[it][i]}" }
        when (student) {
            ".omln" -> result.forEachIndexed { j, v -> v.append("owln."[j]) }
            "owln." -> result.forEachIndexed { j, v -> v.append(".omln"[j]) }
            "..oLn" -> result.forEachIndexed { j, v -> v.append("..oLn"[j]) }
        }
    }
    println(result.joinToString("\n"))
}