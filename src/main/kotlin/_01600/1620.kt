package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val pokemon = HashMap<String, Int>()
    val pokemon2 = HashMap<Int, String>()
    repeat(n) {
        readLine().let { s -> pokemon[s] = it + 1; pokemon2[it + 1] = s }
    }
    repeat(m) {
        readLine().let {
            bw.write(
                if (pokemon[it] != null) "${pokemon[it]}\n"
                else "${pokemon2[it.toInt()]}\n"
            )
        }
    }
    bw.close()
}