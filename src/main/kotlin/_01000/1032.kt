package _01000

fun main() {
    val n = readln().toInt()
    val result = readln().toCharArray()
    for (i in 1 until n){
        val string = readln().toCharArray()
        for (j in result.indices) {
            // 각 문자열을 문자 배열로 받아서 같은 자리의 문자를 비교하여 다른 경우에만 ?로 치환
            if (result[j] != string[j]) {
                result[j] = '?'
            }
        }
    }
    println(result)
}