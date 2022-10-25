package _01100

fun main() {
    var n = readln().toInt()
    var a = 1
    while (n > a) {
        n -= a++
    }
    println(if (a % 2 == 1) "${a - n + 1}/${n}" else "${n}/${a - n + 1}")
}