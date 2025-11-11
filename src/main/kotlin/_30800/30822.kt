package _30800

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val count = IntArray(26)
    readLine().forEach { count[it - 'a']++ }
    println(minOf(count['u' - 'a'], count['o' - 'a'], count['s' - 'a'], count['p' - 'a'], count['c' - 'a']))
}