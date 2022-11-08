package _01300

fun main() {
    readln()
    val files = readln().split(" ").map { it.toInt() }
    val cluster = readln().toInt()
    var total = 0L  // 총 용량의 최대 크기가 50,000,000,000이므로 오버플로를 방지하기 위해 Long형을 사용
    for (n in files) {
        total += if (n % cluster == 0) n / cluster else n / cluster + 1
    }
    println(total * cluster)
}