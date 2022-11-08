package _01300

fun main() {
    val n = readln()
    if (n.length == 1) {
        println("NO")
        return
    }

    for (i in n.indices) {
        val x = n.substring(0, i + 1)
        val y = n.substring(i + 1, n.length)
        var X = 1
        var Y = 1
        for (j in x.indices) {
            X *= x[j] - '0'
        }
        for (j in y.indices) {
            Y *= y[j] - '0'
        }

        if (X == Y) {
            println("YES")
            return
        }
    }

    println("NO")
}