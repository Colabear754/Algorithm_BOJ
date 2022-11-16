package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        bw.write("${lcm(a, b)}\n")
    }
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)
fun lcm(a: Int, b: Int) = a * b / gcd(a, b)