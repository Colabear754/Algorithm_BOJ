package _05500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val str = readLine()
    var count = 0
    var pn = 0
    for (i in 0..m - 3) {
        if (str[i] == 'I') {
            if (str.slice(i + 1..i + 2) == "OI") {
                pn++
                if (n <= pn) count++
            } else pn = 0
        }
    }
    println(count)
}