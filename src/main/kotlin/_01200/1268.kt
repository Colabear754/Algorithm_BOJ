package _01200

fun main() {
    val n = readln().toInt()
    val st = Array(n) { "" }    // 각 학생이 학년별 몇반이었는지를 저장할 배열
    val arr = Array(n) { BooleanArray(n) }  // 같은 반이었는지 여부를 저장할 2차원 배열
    for (i in 0 until n) {
        st[i] = readln().replace(" ", "")   // 공백을 제거하여 저장
    }
    for (i in 0..4) {
        for (j in 0 until n) {
            for (k in 0 until n) {
                if (j != k && st[j][i] == st[k][i]) {
                    arr[j][k] = true    // j번 학생과 k번 학생이 같은 반이었던 적이 있으면 true
                }
            }
        }
    }
    var leader = 1
    var max = 0
    for (i in arr.indices) {
        if (arr[i].count { it } > max) {    // true가 가장 많은 학생을 반장으로 정함
            max = arr[i].count { it }
            leader = i + 1
        }
    }

    println(leader)
}