package _01300

fun main() = println(readln().split(" ").let { (it[0].reversed().toInt() + it[1].reversed().toInt()).toString().reversed().toInt() })