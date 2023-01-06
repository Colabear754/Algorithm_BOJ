package _05100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val whiteSpaceRegex = "\\s{2,}".toRegex()
    val bracketOpenerRegex = "[({\\[]".toRegex()
    val bracketCloserRegex = "[)}\\]]".toRegex()
    repeat(readLine().toInt()) {
        val s1 = readLine().replace(';', ',')
            .trim()
            .replace(whiteSpaceRegex, " ")
            .replace(bracketOpenerRegex, "(")
            .replace(bracketCloserRegex, ")")
            .trimSpecialChar()
        val s2 = readLine().replace(';', ',')
            .trim()
            .replace(whiteSpaceRegex, " ")
            .replace(bracketOpenerRegex, "(")
            .replace(bracketCloserRegex, ")")
            .trimSpecialChar()

        bw.write("Data Set ${it + 1}: ${if (s1.equals(s2, true)) "equal" else "not equal"}\n\n")
    }
    bw.close()
}

fun String.trimSpecialChar() = this.replace("\\s*\\(\\s*".toRegex(), "(")
    .replace("\\s*\\)\\s*".toRegex(), ")")
    .replace("\\s*:\\s*".toRegex(), ":")
    .replace("\\s*;\\s*".toRegex(), ";")
    .replace("\\s*,\\s*".toRegex(), ",")
    .replace("\\s*\\.\\s*".toRegex(), ".")