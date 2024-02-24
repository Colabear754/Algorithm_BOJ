package _03100

import java.util.StringTokenizer

fun main() = with(System.out.bufferedWriter()) {
    val ignore = setOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")
    StringTokenizer(System.`in`.bufferedReader().readLine()).apply {
        write(nextToken()[0].uppercase())
        while (hasMoreTokens()) {
            nextToken().takeUnless { it in ignore }?.let { write(it[0].uppercase()) }
        }
    }
    close()
}