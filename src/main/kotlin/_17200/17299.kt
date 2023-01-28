package _17200

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val f = IntArray(1000001)
    val numbers = IntArray(n) { st.nextToken().toInt().also { i -> f[i]++ } }
    val ngf = IntArray(n)
    val stack = Stack<Int>()

    for (i in n - 1 downTo 0) {
        while (stack.isNotEmpty()) {
            if (f[numbers[i]] >= f[numbers[stack.peek()]]) stack.pop()
            else break
        }
        ngf[i] = -1
        if (stack.isNotEmpty()) ngf[i] = numbers[stack.peek()]
        stack.push(i)
    }
    print(ngf.joinToString(" "))
}