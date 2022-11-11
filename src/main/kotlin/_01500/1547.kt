package _01500

fun main() = with(System.`in`.bufferedReader()){
    val m = readLine().toInt()
    val cup = arrayOf(true, false, false)
    repeat(m) {
        val n = readLine().split(" ").map { it.toInt() - 1 }
        cup[n[0]] = cup[n[1]].also { cup[n[1]] = cup[n[0]] }
    }
    println(cup.indexOf(true) + 1)
}