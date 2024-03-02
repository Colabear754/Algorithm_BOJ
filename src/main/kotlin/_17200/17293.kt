package _17200

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    for (i in n downTo 1) {
        write("""
            ${getBottle(i)} of beer on the wall, ${getBottle(i)} of beer.
            Take one down and pass it around, ${getBottle(i - 1)} of beer on the wall.
            
            
        """.trimIndent())
    }
    write("""
        No more bottles of beer on the wall, no more bottles of beer.
        Go to the store and buy some more, ${getBottle(n)} of beer on the wall.
    """.trimIndent())
    close()
}

private fun getBottle(i: Int) = when (i) {
    0 -> "no more bottles"
    1 -> "1 bottle"
    else -> "$i bottles"
}