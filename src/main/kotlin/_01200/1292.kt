package _01200

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val list = ArrayList<Int>()
    for (i in 1 .. b) {
        repeat(i) {
            list.add(i)
        }
    }
    println(list.subList(a - 1, b).sum())
}