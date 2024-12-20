package _21200

fun main() = with(System.`in`.bufferedReader()) {
    val (stringA, stringB) = readLine().split(' ')
    val minimumA = maxOf(2, stringA.maxOf { if (it in '0'..'9') it - '0' + 1 else it - 'a' + 10 })
    val minimumB = maxOf(2, stringB.maxOf { if (it in '0'..'9') it - '0' + 1 else it - 'a' + 10 })
    var x = -1L
    var a = 0
    var b = 0
    for (i in minimumA..36) {
        for (j in minimumB..36) {
            try {
                val decimalA = stringA.toLong(i)
                val decimalB = stringB.toLong(j)
                if (decimalA == decimalB) {
                    if (x != -1L) {
                        println("Multiple")
                        return@with
                    }
                    if (i == j) continue
                    x = decimalA
                    a = i
                    b = j
                }
            } catch (_: NumberFormatException) {}
        }
    }
    println(if (x == -1L) "Impossible" else "$x $a $b")
}