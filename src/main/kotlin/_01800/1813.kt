package _01800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val str = readLine().split(" ").map { it.toInt() }
    val map = HashMap<Int, Int>()
    var max = -1
    map[0] = 0

    for (s in str) {
        map[s] = if (map.containsKey(s)) map[s]!! + 1 else 1
    }

    for (i in n downTo 0) {
        if (i == map[i]) {
            max = i
            break
        }
    }

    println(max)
}