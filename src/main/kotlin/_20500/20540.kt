package _20500

fun main() = with(System.`in`.bufferedReader()) {
    val charArray = CharArray(26)
    charArray['E' - 'A'] = 'I'
    charArray['I' - 'A'] = 'E'
    charArray['S' - 'A'] = 'N'
    charArray['N' - 'A'] = 'S'
    charArray['T' - 'A'] = 'F'
    charArray['F' - 'A'] = 'T'
    charArray['J' - 'A'] = 'P'
    charArray['P' - 'A'] = 'J'
    println(readLine().map { charArray[it - 'A'] }.joinToString(""))
}