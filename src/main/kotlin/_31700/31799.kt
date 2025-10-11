package _31700

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val grades = ArrayList<String>()
    val sb = StringBuilder()
    readLine().forEach {
        if (it in "+-0") {
            sb.append(it)
            return@forEach
        }
        if (sb.length == 1) sb.append('0')
        if (sb.isNotEmpty()) grades.add(sb.toString())
        sb.clear()
        sb.append(it)
    }
    if (sb.length == 1) sb.append('0')
    grades.add(sb.toString())
    sb.clear()
    var prev = "Z"
    for (grade in grades) {
        sb.append(grade.convertGrade(prev))
        prev = grade
    }
    println(sb)
}

private fun String.convertGrade(prev: String) = when (this) {
    "A+" -> "E"
    "A0" -> if (prev in listOf("A+", "A0")) "P" else "E"
    "A-", "B+" -> if (prev in listOf("A+", "A0", "A-", "B+")) "D" else "P"
    "B0", "B-" -> if (prev in listOf("C+", "C0", "C-", "Z")) "D" else "B"
    else -> "B"
}