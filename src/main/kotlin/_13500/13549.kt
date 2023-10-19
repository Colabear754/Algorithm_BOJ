package _13500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val visited = BooleanArray(100001)
    visited[n] = true
    val queue = ArrayDeque<Pair<Int, Int>>().apply { add(n to 0) }
    while (queue.isNotEmpty()) {
        repeat(queue.size) {
            val (position, time) = queue.removeFirst()
            if (position == k) {
                println(time)
                return
            }
            if (position * 2 <= 100000 && !visited[position * 2]) {
                queue.addFirst(position * 2 to time)
                visited[position * 2] = true
            }
            if (position - 1 >= 0 && !visited[position - 1]) {
                queue.addLast(position - 1 to time + 1)
                visited[position - 1] = true
            }
            if (position + 1 <= 100000 && !visited[position + 1]) {
                queue.addLast(position + 1 to time + 1)
                visited[position + 1] = true
            }
        }
    }
}