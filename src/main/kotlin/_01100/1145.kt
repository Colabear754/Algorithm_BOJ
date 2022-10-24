package _01100

fun main() {
    val array = readln().split(" ").map { it.toInt() }
    var n = 1
    while (true) {
        var count = 0
        for (i in array.indices) {
            if (n % array[i] == 0) {
                count++
            }
        }
        if (count >= 3) {
            break
        }
        n++
    }
    println(n)
}