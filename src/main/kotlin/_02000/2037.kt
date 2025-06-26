package _02000

private val chars = arrayOf(
    arrayOf('A', 'B', 'C'),
    arrayOf('D', 'E', 'F'),
    arrayOf('G', 'H', 'I'),
    arrayOf('J', 'K', 'L'),
    arrayOf('M', 'N', 'O'),
    arrayOf('P', 'Q', 'R', 'S'),
    arrayOf('T', 'U', 'V'),
    arrayOf('W', 'X', 'Y', 'Z')
)

fun main() = with(System.`in`.bufferedReader()) {
    val (p, w) = readLine().split(" ").map { it.toInt() }
    val str = readLine()
    var sec = addedVal(str) * p
    for (i in 1..str.lastIndex) {
        if (getNum(str[i]) == 8) {
            sec += p
        } else {
            sec += addedVal(str, i) * p
            if (getNum(str[i - 1]) == getNum(str[i])) {
                sec += w
            }
        }
    }
    println(sec)
}

private fun addedVal(s: String, i: Int = 0) = chars[getNum(s[i])].indexOf(s[i]) + 1

private fun getNum(c: Char) = when (c) {
    in 'A'..'C' -> 0
    in 'D'..'F' -> 1
    in 'G'..'I' -> 2
    in 'J'..'L' -> 3
    in 'M'..'O' -> 4
    in 'P'..'S' -> 5
    in 'T'..'V' -> 6
    in 'W'..'Z' -> 7
    else -> 8
}
