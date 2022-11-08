package _01300

fun main() {
    val n = readln()
    // 한자리 수는 유진수가 될 수 없음
    if (n.length == 1) {
        println("NO")
        return
    }

    for (i in n.indices) {
        val x = n.substring(0, i + 1)
        val y = n.substring(i + 1, n.length)
        var X = 1
        var Y = 1
        // 앞 수의 곱 계산
        for (j in x.indices) {
            X *= x[j] - '0'
        }
        // 뒷 수의 곱 계산
        for (j in y.indices) {
            Y *= y[j] - '0'
        }

        // 한번이라도 유진수를 만족하는 조건이 있으면 YES를 출력하고 종료
        if (X == Y) {
            println("YES")
            return
        }
    }
    // 반복문 도중에 프로그램이 종료되지 않으면 유진수가 아니므로 NO를 출력
    println("NO")
}