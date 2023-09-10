package _12800

fun main() = with(System.`in`.bufferedReader()) {
    val sb = Array(5) { StringBuilder() }
    val a = readLine()
    val b = readLine()
    repeat(a.length) {
        sb[0].append(a[it] - '0' and b[it] - '0')
        sb[1].append(a[it] - '0' or b[it] - '0')
        sb[2].append(a[it] - '0' xor b[it] - '0')
        sb[3].append(if (a[it] == '0') '1' else '0')
        sb[4].append(if (b[it] == '0') '1' else '0')
    }
    println(sb.joinToString("\n"))
}