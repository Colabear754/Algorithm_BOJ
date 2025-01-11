package _01300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val editor = mutableListOf<Pair<String, Int>>()
    editor.add("" to 0)
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val command = st.nextToken()
        when (command) {
            "type" -> editor.add(editor.last().first + st.nextToken() to st.nextToken().toInt())
            else -> {
                val (undoTiming, executeTime) = st.nextToken().toInt() to st.nextToken().toInt()
                val timeToCancel = executeTime - undoTiming
                if (timeToCancel <= 0) {
                    editor.add("" to executeTime)
                    return@repeat
                }
                for (i in editor.indices.reversed()) {
                    if (editor[i].second < timeToCancel) {
                        editor.add(editor[i].first to executeTime)
                        break
                    }
                }
            }
        }
    }
    println(editor.lastOrNull()?.first ?: "")
}