package _01100

fun main() {
    val string = readln().uppercase()   // 문자열 대문자로 입력
    var maxChar = '?'   // 가장 많이 나온 문자
    var count = 0   // 가장 많이 나온 횟수
    for (char in 'A' .. 'Z') {
        val countCurr = string.count{c -> c == char}    // A부터 Z까지 현재 문자의 개수
        if (countCurr > count) {    // 현재 문자의 개수가 더 많으면 바꿈
            count = countCurr
            maxChar = char
        } else if (countCurr == count) {
            maxChar = '?'
        }
    }
    println(maxChar)
}