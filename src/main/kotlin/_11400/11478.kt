package _11400

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val set = HashSet<String>()
    for (i in s.indices) {
        for (j in i..s.lastIndex) {
            set.add(s.slice(i..j))
        }
    }
    println(set.size)
}