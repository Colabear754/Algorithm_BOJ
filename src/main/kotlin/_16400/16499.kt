package _16400

fun main() = with(System.`in`.bufferedReader()) {
    val set = HashSet<String>()
    repeat(readLine().toInt()) {
        set.add(readLine().toCharArray().sortedArray().joinToString(""))
    }
    println(set.size)
}