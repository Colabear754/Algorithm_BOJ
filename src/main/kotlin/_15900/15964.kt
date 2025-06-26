package _15900

fun main() = print(readln().split(' ').map { it.toLong() }.let { it[0] `@` it[1] })
private infix fun Long.`@`(b: Long) = (this + b) * (this - b)