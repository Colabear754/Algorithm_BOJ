package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (k, n) = readLine().split(' ').map { it.toInt() }
    var maxLength = 0
    val numbers = Array(k) { readLine().also { n -> maxLength = maxOf(maxLength, n.length) } }
    numbers.sortWith { n1, n2 -> (n2 + n1).compareTo(n1 + n2) }
    var isMax = false
    for (i in numbers.indices) {
        if (!isMax && numbers[i].length == maxLength) {
            isMax = true
            for (j in 0..n - k) {
                bw.write(numbers[i])
            }
        } else {
            bw.write(numbers[i])
        }
    }
    bw.close()
}