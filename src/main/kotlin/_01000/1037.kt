package _01000

fun main() {
    // 진짜 약수가 모두 주어지기 때문에 N은 약수의 최소값과 최대값을 곱하면 된다
    readln()
    val array = readln().split(" ").map { it.toInt() }.sortedDescending()
    println(array[0] * array[array.lastIndex])
}