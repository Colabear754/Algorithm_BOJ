package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val (n, l) = readLine().split(" ").map { it.toInt() }
    var c = 0   // 라벨을 붙인 학생 수
    var label = 1   // 라벨 번호
    while (c < n) {
        if (!label.toString().contains(l.toString())) {
            c++
        }
        label++ // 다음 라벨 번호로 넘어감
    }
    println(label - 1)
}