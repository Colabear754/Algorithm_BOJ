package _01000

import kotlin.math.max

fun main() {
    val n = readlnOrNull()!!.toInt()    // 테스트 케이스의 개수

    val input = IntArray(n) // 각 테스트 케이스를 저장할 배열
    var maxInput = 0    // 입력된 테스트 케이스의 최대치

    for (i in 0 until n) {
        input[i] = readlnOrNull()!!.toInt()
        maxInput = max(input[i], maxInput)
    }

    val result = Array(maxInput + 1) { IntArray(2) }   // 피보나치 수열에서 0과 1을 반환한 횟수를 기록할 2차원 배열
    // 테스트 케이스의 최대치에 대한 경우만 계산해 놓으면 그보다 작은 테스트 케이스에 대한 경우의 수는 이미 계산해놓은 값만 불러오면 됨
    result[0][0] = 1
    if (maxInput > 0) { // 1을 호출하는 기본 경우는 최대 입력값이 0보다 클때만 할당
        result[1][1] = 1
    }

    for (i in 2..maxInput) {    // f(n)에서 0과 1을 반환한 횟수가 c(n)이면 c(n) =  c(n - 1) + c(n - 2)와 같음
        result[i][0] = result[i - 1][0] + result[i - 2][0]
        result[i][1] = result[i - 1][1] + result[i - 2][1]
    }

    for (i in 0 until n) {
        println("${result[input[i]][0]} ${result[input[i]][1]}")
    }
}