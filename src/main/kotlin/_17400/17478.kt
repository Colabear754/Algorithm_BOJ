package _17400

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n")
    val n = readLine().toInt()
    println(sb.append(answer(0, n)))
}

private fun answer(start: Int, end: Int): StringBuilder {
    val sb = StringBuilder()
    val level = "____".repeat(start)
    sb.append(level).append("\"재귀함수가 뭔가요?\"\n")
    if (start == end) {
        sb.append(level).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n")
    } else {
        sb.append("""
            $level"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
            ${level}마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
            ${level}그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
        """.trimIndent()).append('\n')
        sb.append(answer(start + 1, end))
    }
    return sb.append(level).append("라고 답변하였지.\n")
}