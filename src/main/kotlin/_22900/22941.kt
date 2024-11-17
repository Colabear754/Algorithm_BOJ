package _22900

fun main() = with(System.`in`.bufferedReader()) {
    val (braveHp, braveAtk, devilHp, devilAtk) = readLine().split(' ').map { it.toLong() }
    val (p, s) = readLine().split(' ').map { it.toLong() }
    var braveTurns = (devilHp + braveAtk - 1) / braveAtk
    val devilTurns = (braveHp + devilAtk - 1) / devilAtk
    if (devilHp - braveAtk * (braveTurns - 1) in 1..p) braveTurns = (devilHp + s + braveAtk - 1) / braveAtk
    println(if (braveTurns <= devilTurns) "Victory!" else "gg")
}