package _12700

fun main() = with(System.`in`.bufferedReader()) {
    val (aAtk, aHp) = readLine().split(' ').map { it.toInt() }
    val (bAtk, bHp) = readLine().split(' ').map { it.toInt() }
    val aCount = (bHp + aAtk - 1) / aAtk
    val bCount = (aHp + bAtk - 1) / bAtk
    println(if (bCount > aCount) "PLAYER A" else if (bCount < aCount) "PLAYER B" else "DRAW")
}