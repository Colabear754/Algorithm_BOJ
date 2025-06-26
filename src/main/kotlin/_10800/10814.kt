package _10800

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val member = PriorityQueue<Person>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        member.add(Person(st.nextToken().toInt(), st.nextToken(), it))
    }
    repeat(member.size) {
        bw.write("${member.poll()}\n")
    }
    bw.close()
}

private class Person(val age: Int, val name: String, val order: Int): Comparable<Person> {
    override fun toString() = "$age $name"
    override fun compareTo(other: Person) = if (this.age - other.age != 0) this.age - other.age else this.order - other.order
}