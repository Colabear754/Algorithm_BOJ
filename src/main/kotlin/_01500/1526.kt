package _01500

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    while (true) {
        if (!n.toString().contains("[^47]".toRegex())) {
            println(n)
            return
        }
        n--
    }
}