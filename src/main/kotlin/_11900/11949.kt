package _11900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val students = IntArray(n) { readLine().toInt() }
    for (i in 1..m) {
        for (j in 0..<n - 1) {
            if (students[j] % i > students[j + 1] % i) students[j] = students[j + 1].also { students[j + 1] = students[j] }
        }
    }
    println(students.joinToString("\n"))
}