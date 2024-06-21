package _20100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = Array(n) { readLine() }
    for (i in 0..<n) {
        for (j in i..<n) {
            if (array[i][j] != array[j][i]) {
                println("NO")
                return@with
            }
        }
    }
    println("YES")
}