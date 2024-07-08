package _05800

fun main() = with(System.`in`.bufferedReader()) {
    val customers = IntArray(readLine().toInt()) { readLine().toInt() }
    val storages = HashSet<Int>()
    var result = 1
    for (i in customers.indices) {
        if (!storages.add(customers[i])) continue
        var prev = customers[i]
        var length = 1
        for (j in customers.indices) {
            if (customers[i] == customers[j]) continue
            if (prev == customers[j]) result = maxOf(result, ++length)
            else length = 1
            prev = customers[j]
        }
    }
    println(result)
}