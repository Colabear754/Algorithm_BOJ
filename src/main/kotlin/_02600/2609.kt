package _02600

fun main() = print(readln().split(' ').map { it.toInt() }.let { "${gcd(it[0], it[1])}\n${lcm(it[0], it[1])}" })
fun gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)
fun lcm(a: Int, b: Int) = a * b / gcd(a, b)