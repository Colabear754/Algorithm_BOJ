package _25100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val users = HashSet<String>()
    var count = 0
    repeat(n) {
        readLine().also {
            if (it == "ENTER") {
                users.clear()
                return@repeat
            }
            else if (!users.contains(it)) count++
            users.add(it)
        }
    }
    println(count)
}