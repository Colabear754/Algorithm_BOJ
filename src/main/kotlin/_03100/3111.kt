package _03100

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine()
    val t = readLine()
    val leftDeque = ArrayDeque<Char>()
    val rightDeque = ArrayDeque<Char>()
    var left = 0
    var right = t.lastIndex
    var isRemoved = false
    while (left <= right) {
        if (!isRemoved) {
            leftDeque.addLast(t[left++])
            if (leftDeque.size >= a.length) {
                if (leftDeque.takeLast(a.length).joinToString("") == a) {
                    repeat(a.length) { leftDeque.removeLast() }
                    isRemoved = true
                }
            }
        }
        if (isRemoved && left <= right) {
            rightDeque.addFirst(t[right--])
            if (rightDeque.size >= a.length) {
                if (rightDeque.take(a.length).joinToString("") == a) {
                    repeat(a.length) { rightDeque.removeFirst() }
                    isRemoved = false
                }
            }
        }
    }
    val result = StringBuilder(leftDeque.joinToString("") + rightDeque.joinToString(""))
    while (true) {
        val index = result.indexOf(a)
        if (index == -1) break
        result.delete(index, index + a.length)
    }
    println(result)
}