package _01500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, l) = readLine().split(" ").map { it.toInt() }
    val ball = IntArray(n)  // 공을 받은 횟수를 저장할 배열
    ball[0] = 1 // 1번은 공을 갖고 시작하므로 1로 시작
    var has = 0 // 공을 가진 친구의 인덱스
    var count = 0
    while (!ball.contains(m)) {
        when (ball[has] % 2) {
            1 -> {
                has = if (has + l < n) has + l else has + l - n
            }
            0 -> {
                has = if (has - l >= 0) has - l else has - l + n
            }
        }
        ball[has]++
        count++
    }
    println(count)
}