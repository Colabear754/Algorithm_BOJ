package _04600

fun main() = with(System.out.bufferedWriter()) {
    val check = BooleanArray(10001)

    for (i in 1..10000) {
        if (d(i) <= 10000) {
            check[d(i)] = true
        }
    }
    for (i in 1..10000) {
        if (!check[i]) write("$i\n")
    }
    close()
}

private fun d(n: Int): Int {
    var sum = n
    var num = n

    while (num != 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}