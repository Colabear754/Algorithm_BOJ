package _16200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, input) = readLine().split(' ')
    val result = Array(3) { "" }
    when (n) {
        "1" -> {
            result[0] = input
            result[1] = input.replace(Regex("[A-Z]")) { "_${it.value.lowercase()}" }
            result[2] = input.replaceFirstChar { it.uppercase() }
        }
        "2" -> {
            val split = input.split('_')
            result[0] = split.joinToString("") { it.replaceFirstChar { c -> c.uppercase() } }.replaceFirstChar { it.lowercase() }
            result[1] = input
            result[2] = split.joinToString("") { it.replaceFirstChar { c -> c.uppercase() } }
        }
        "3" -> {
            result[0] = input.replaceFirstChar { it.lowercase() }
            result[1] = input.replaceFirstChar { it.lowercase() }.replace(Regex("[A-Z]")) { "_${it.value.lowercase()}" }
            result[2] = input
        }
    }
    println(result.joinToString("\n"))
}