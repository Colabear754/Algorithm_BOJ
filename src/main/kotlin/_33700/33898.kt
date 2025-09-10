package _33700

fun main() = with(System.`in`.bufferedReader()) {
    val input = Array(2) { readLine() }.let {
        listOf(StringBuilder("${it[0]}${it[1].reversed()}"), StringBuilder("${it[1]}${it[0].reversed()}"))
    }
    for (string in input) {
        repeat(4) { if (string.append(string[0]).deleteAt(0).contentEquals("HEPC")) return@with println("YES") }
    }
    println("NO")
}