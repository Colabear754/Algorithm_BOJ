package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pair = IntArray(10923)
    for (i in n downTo 1) {
        if (pair[i] != 0) continue
        var power = 2
        while (true) {
            val sub = power - i
            if (power > i && pair[sub] == 0) {
                pair[i] = sub
                pair[sub] = i
                break
            }
            power = power shl 1
        }
    }
    println(pair.slice(1..n).joinToString("\n"))
}