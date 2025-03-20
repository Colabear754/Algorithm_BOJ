package _13400

fun main() = with(System.`in`.bufferedReader()) {
    val (k, l) = readLine().split(' ').map { it.toInt() }
    val set = mutableSetOf<String>()
    repeat(l) {
        readLine().let {
            set.remove(it)
            set.add(it)
        }
    }
    println(set.take(k).joinToString("\n"))
}