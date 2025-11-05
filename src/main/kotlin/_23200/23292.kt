package _23200

fun main() = with(System.`in`.bufferedReader()) {
    val birthday = readLine()
    var result = "99991231"
    var max = 0
    repeat(readLine().toInt()) {
        val today = readLine()
        val biorhythm = today.let {
            ((it[0] - birthday[0]).power + (it[1] - birthday[1]).power + (it[2] - birthday[2]).power + (it[3] - birthday[3]).power) *
                    ((it[4] - birthday[4]).power + (it[5] - birthday[5]).power) * ((it[6] - birthday[6]).power + (it[7] - birthday[7]).power)
        }
        if (biorhythm >= max) {
            result = if (biorhythm == max) minOf(result, today) else today
            max = biorhythm
        }
    }
    println(result)
}

private val Int.power get() = this * this