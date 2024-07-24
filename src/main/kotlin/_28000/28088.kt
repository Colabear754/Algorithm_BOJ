package _28000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val students = IntArray(n)
    repeat(m) { students[readLine().toInt()] = 1 }
    val prevState = students.copyOf()
    repeat(k) {
        for (i in students.indices) {
            students[i] = prevState[(i + n - 1) % n] xor prevState[(i + 1) % n]
        }
        prevState.indices.forEach { prevState[it] = students[it] }
    }
    println(students.count { it == 1 })
}