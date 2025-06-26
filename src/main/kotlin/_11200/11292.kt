package _11200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var c: Int
    val bw = System.out.bufferedWriter()
    while (readLine().also { c = it.toInt() } != "0") {
        var max = 0.0
        val list = ArrayList<Person>()
        repeat(c) {
            val st = StringTokenizer(readLine())
            list.add(Person(st.nextToken(), st.nextToken().toDouble().also { max = maxOf(max, it) }))
        }
        bw.write("${list.filter { it.height == max }.joinToString(" ")}\n")
    }
    bw.close()
}

private class Person(val name: String, val height: Double) {
    override fun toString() = this.name
}