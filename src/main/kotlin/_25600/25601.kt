package _25600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val inheritanceMap = HashMap<String, HashSet<String>>()
    repeat(readLine().toInt() - 1) {
        StringTokenizer(readLine()).apply {
            val parent = nextToken()
            val child = nextToken()
            inheritanceMap[parent]?.add(child) ?: run { inheritanceMap[parent] = hashSetOf(child) }
        }
    }
    val (a, b) = StringTokenizer(readLine()).run { nextToken() to nextToken() }
    println(if (inheritanceMap.isAncestor(a, b) || inheritanceMap.isAncestor(b, a)) 1 else 0)
}

private fun HashMap<String, HashSet<String>>.isAncestor(a: String, b: String): Boolean {
    if (a == b) return true
    for (child in this[a] ?: return false) {
        if (isAncestor(child, b)) return true
    }
    return false
}