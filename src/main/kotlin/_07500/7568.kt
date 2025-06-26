package _07500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder("")
    val people = Array(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        Person(st.nextToken().toInt(), st.nextToken().toInt())
    }
    for (i in people.indices) {
        var rank = 1
        for (j in people.indices) {
            rank += if (people[i] < people[j]) 1 else 0
        }
        sb.append("$rank ")
    }
    println(sb)
}

private class Person(val w: Int, val h: Int) : Comparable<Person> {
    override fun compareTo(other: Person) = if ((this.w - other.w) * (this.h - other.h) > 0) this.w - other.w else 0
}