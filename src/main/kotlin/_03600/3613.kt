package _03600

fun main() = with(System.`in`.bufferedReader()) {
    val name = readLine()
    if ((name.contains("_") && name.contains("[A-Z]".toRegex())) || name.first() == '_' || name.last() == '_' || name.contains("__") || name.first().isUpperCase()) {
        println("Error!")
        return@with
    }
    val sb = StringBuilder()
    var isUnderBar = false
    name.forEach {
        if (it == '_') {
            isUnderBar = true
            return@forEach
        }
        if (isUnderBar) {
            sb.append(it.uppercaseChar())
            isUnderBar = false
            return@forEach
        }
        if (it.isUpperCase()) {
            sb.append('_')
            sb.append(it.lowercaseChar())
            return@forEach
        }
        sb.append(it)
    }
    println(sb)
}