package _13700

import java.util.BitSet
import java.util.StringTokenizer

fun main() = with(StringTokenizer(readln())) {
    val sb = StringBuilder()
    val bitSet = BitSet()
    while (hasMoreTokens()) {
        val n = nextToken().toInt()
        if (!bitSet[n]) {
            sb.append(n).append(' ')
            bitSet[n] = true
        }
    }
    println(sb)
}