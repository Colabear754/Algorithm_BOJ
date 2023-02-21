package _09400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val array = LongArray(101)
    array[1] = 1L
    array[2] = 1L
    array[3] = 1L
    for (i in 4..100) {
        array[i] = array[i - 2] + array[i - 3]
    }
    repeat(readLine().toInt()) {
        bw.write("${array[readLine().toInt()]}\n")
    }
    bw.close()
}