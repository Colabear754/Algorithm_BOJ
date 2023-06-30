package _13200

fun main() = print(readln().split(' ').map(String::toLong).reduce(::lcm))
private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
private fun lcm(a: Long, b: Long): Long = a * b / gcd(a, b)