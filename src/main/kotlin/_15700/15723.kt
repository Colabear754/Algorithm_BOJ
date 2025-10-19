package _15700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val premises = CharArray(26)
    repeat(readLine().toInt()) {
        readLine().apply { premises[first() - 'a'] = last() }
    }
    repeat(readLine().toInt()) {
        val query = readLine()
        var subject = query.first() - 'a'
        val predicate = query.last()
        while (premises[subject] != '\u0000') {
            val result = premises[subject]
            if (result == predicate) return@repeat bw.write("T\n")
            subject = result - 'a'
        }
        bw.write("F\n")
    }
    bw.close()
}