package _01300

fun main() {
    val (n, l, d) = readln().split(" ").map { it.toInt() }
    val isPlaying = ArrayList<Boolean>()
    var time = 0
    for (i in 0 until n) {
        // true : 재생중인 구간
        // false : 조용한 구간
        repeat(l) {
            isPlaying.add(true)
        }
        repeat(5) {
            isPlaying.add(false)
        }
    }

    while (true) {
        if (time >= isPlaying.size) {
            break
        }
        if (!isPlaying[time]) {
            break
        } else {
            time += d
        }
    }

    println(time)
}