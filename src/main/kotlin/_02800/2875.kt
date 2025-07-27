package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val maxTeams = minOf(n / 2, m)
    val remain = n + m - maxTeams * 3
    println(maxOf(0, if (remain >= k) maxTeams else maxTeams - ((k - remain + 2) / 3)))
}