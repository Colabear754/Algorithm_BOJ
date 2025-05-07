package _31500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val songMap = mutableMapOf<String, String>()
    repeat(n) {
        val st = java.util.StringTokenizer(readLine())
        st.nextToken()
        val song = st.nextToken()
        val melody = "${st.nextToken()} ${st.nextToken()} ${st.nextToken()}"
        songMap[melody] = if (songMap.containsKey(melody)) "?" else song
    }
    repeat(m) { bw.write("${songMap[readLine()] ?: "!"}\n") }
    bw.close()
}