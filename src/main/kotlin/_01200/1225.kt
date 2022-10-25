package _01200

fun main() {
    val (a, b) = readln().split(" ")
    var result = 0L
    for (i in a.indices) {
        for (j in b.indices) {
            result += (a[i].code - 48) * (b[j].code - 48)
        }
    }
    println(result)
}