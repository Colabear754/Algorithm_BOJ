package _31700

fun main() = with(System.`in`.bufferedReader()) {
    val (cycle, damage) = Array(3) { readLine().split(' ').map { it.toInt() } }
        .run { IntArray(3) { this[it][0] } to IntArray(3) { this[it][1] } }
    var hp = readLine().toInt() - damage.sum()
    var time = 0
    while (hp > 0) {
        time++
        cycle.forEachIndexed { index, num -> if (time % num == 0) hp -= damage[index] }
    }
    println(time)
}