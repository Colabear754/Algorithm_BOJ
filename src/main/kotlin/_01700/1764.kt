package _01700

import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val unheard = HashSet<String>()
    repeat(n) {
        unheard.add(readLine())
    }
    val who = TreeSet<String>()
    repeat(m) {
        readLine().let { if (unheard.contains(it)) who.add(it) }
    }
    println("${who.size}\n${who.joinToString("\n")}")
}