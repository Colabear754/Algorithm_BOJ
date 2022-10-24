package _01100

fun main() {
    var cycle = 0
    val start = readln().toInt()
    var num = start
    while (true) {
        val a = num / 10
        val b = num % 10
        val c = (a + b) % 10
        num = b * 10 + c

        cycle++
        if (start == num) {
            break
        }
    }
    println(cycle)
}