package _30900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val miniatures = Array(readLine().toInt()) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
    val choice1 = ArrayList<IntArray>()
    val choice2 = ArrayList<IntArray>()
    miniatures.forEach { m ->
        choice1.add(m)
        choice1.sortWith(compareBy({ -it[0] }, { it[1] }))
        if (choice1.size > 2) choice1.removeLast()
        choice2.add(m)
        choice2.sortWith(compareBy({ it[1] }, { -it[0] }))
        if (choice2.size > 2) choice2.removeLast()
    }
    bw.appendLine(choice1.joinToString(" ") { "${it[0]} ${it[1]}" })
    bw.appendLine(choice2.joinToString(" ") { "${it[0]} ${it[1]}" })
    bw.close()
}