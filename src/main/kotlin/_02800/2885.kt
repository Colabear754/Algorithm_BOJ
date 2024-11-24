package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val bitK = k.toString(2)
    val chocolate = (1 shl bitK.length).let { if (it / 2 == k) k else it }
    println("$chocolate ${bitK.lastIndexOf('1') + if (k == chocolate) 0 else 1}")
}