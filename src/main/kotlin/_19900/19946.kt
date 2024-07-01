package _19900

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toULong()
    var result = 64
    while (n > 0u) {
        if (n and 1u == 1uL) {
            println(result)
            break
        }
        n = n shr 1
        result--
    }
}