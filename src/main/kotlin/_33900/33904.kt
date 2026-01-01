package _33900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val codeMap = mutableMapOf<Char, String>()
    var input: String
    while ("for" in readLine().also { input = it.trim() }) {
        if (input[9] in codeMap) codeMap.remove(input[9])
        codeMap[input[9]] = input
    }
    codeMap.keys.toSet().forEach { if (it !in input) codeMap.remove(it) }
    for ((i, line) in codeMap.values.withIndex()) {
        bw.write(" ".repeat(i))
        bw.appendLine(line)
    }
    bw.write(" ".repeat(codeMap.size))
    bw.write(input)
    bw.close()
}