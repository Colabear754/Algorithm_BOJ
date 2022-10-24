package _01100

fun main() {
    val string = readln().split(" ")    // 입력받은 문자열을 공백으로 나눠서 저장
    var size = string.size
    // 공백으로 시작하는 경우
    if (string[0].isBlank()) {
        size--
    }
    // 공백으로 끝나는 경우
    if (string[string.lastIndex].isBlank()) {
        size--
    }

    println(size)
}