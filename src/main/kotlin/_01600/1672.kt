package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val map = arrayOf(
        arrayOf('A', 'C', 'A', 'G'),
        arrayOf('C', 'G', 'T', 'A'),
        arrayOf('A', 'T', 'C', 'G'),
        arrayOf('G', 'A', 'G', 'T')
    )
    val n = readLine().toInt()
    val dna = readLine()
    if (n == 1) {
        println(dna)
        return@with
    }
    var result = map[index(dna[dna.lastIndex - 1])][index(dna.last())]
    for (i in dna.length - 3 downTo 0) {
        result = map[index(dna[i])][index(result)]
    }
    println(result)
}

fun index(c: Char) = when(c) {
    'A' -> 0
    'G' -> 1
    'C' -> 2
    else -> 3
}