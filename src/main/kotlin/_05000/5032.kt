package _05000

fun main() = with(System.`in`.bufferedReader()) {
    val (e, f, c) = readLine().split(' ').map { it.toInt() }
    var bottle = e + f
    var softDrink = 0
    while (bottle >= c) {
        softDrink += bottle / c
        bottle = bottle / c + bottle % c
    }
    println(softDrink)
}