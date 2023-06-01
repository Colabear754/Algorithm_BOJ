package _14700

fun main() = with(System.out.bufferedWriter()) {
    val (x, y, n) = readln().split(' ').map { it.toInt() }
    repeat(n) {
        val num = it + 1
        if (num % x != 0 && num % y != 0) {
            write("$num\n")
            return@repeat
        }
        if (num % x == 0) write("Fizz")
        if (num % y == 0) write("Buzz")
        write("\n")
    }
    close()
}