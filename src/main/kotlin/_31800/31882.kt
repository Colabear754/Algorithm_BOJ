package _31800

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val s = readLine()
    var sb = StringBuilder()
    val list = ArrayList<StringBuilder>()
    for (num in s) {
        if (num == '2') {
            sb.append(2)
            continue
        }
        if (sb.isEmpty()) continue
        list.add(sb)
        sb = StringBuilder()
    }
    if (sb.isNotEmpty()) list.add(sb)
    var result = 0L
    for (num in list) {
        val length = num.length.toLong()
        result += length * (length + 1) * (length + 2) / 6
    }
    println(result)
}