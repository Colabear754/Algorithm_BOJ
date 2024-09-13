package _06400

import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val set = TreeSet<String>()
    val charCount = IntArray(26)
    repeat(readLine().toInt()) {
        val s = readLine().toCharArray().sortedArray()
        s.forEach { charCount[it - 'a']++ }
        val n = s.size
        val deque = ArrayDeque<Char>()
        fun makeAnagram(index: Int) {
            if (index == n) {
                set.add(deque.joinToString(""))
                return
            }
            for (i in 0..25) {
                if (charCount[i] <= 0) continue
                charCount[i]--
                deque.addLast('a' + i)
                makeAnagram(index + 1)
                deque.removeLast()
                charCount[i]++
            }
        }
        makeAnagram(0)
        set.forEach { bw.write("$it\n") }
        set.clear()
        charCount.fill(0)
    }
    bw.close()
}