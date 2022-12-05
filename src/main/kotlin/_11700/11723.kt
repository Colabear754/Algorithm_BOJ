package _11700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val s = ByteArray(21)
    var st: StringTokenizer
    repeat(readLine().toInt()) {
        st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "add" -> s[st.nextToken().toInt()] = 1
            "remove" -> s[st.nextToken().toInt()] = 0
            "check" -> bw.write(if (s[st.nextToken().toInt()] == 1.toByte()) "1\n" else "0\n")
            "toggle" -> st.nextToken().toInt().let { n -> s[n] = if (s[n] == 1.toByte()) 0 else 1}
            "all" -> for (i in s.indices) s[i] = 1
            "empty" -> for (i in s.indices) s[i] = 0
        }
    }
    bw.close()
}