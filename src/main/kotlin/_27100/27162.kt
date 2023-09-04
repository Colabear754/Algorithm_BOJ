package _27100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val pedigree = readLine()
    val dice = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
    val distinctDice = dice.distinct().toIntArray()
    val scores = IntArray(12)
    for (i in scores.indices) {
        if (pedigree[i] == 'N') continue
        scores[i] = when (i) {
            0 -> dice.homework(1)
            1 -> dice.homework(2)
            2 -> dice.homework(3)
            3 -> dice.homework(4)
            4 -> dice.homework(5)
            5 -> dice.homework(6)
            6 -> dice.calcFourOfAKind()
            7 -> distinctDice.calcFullHouse()
            8 -> distinctDice.calcLittleStraight()
            9 -> distinctDice.calcBigStraight()
            10 -> distinctDice.calcYacht()
            else -> dice.sum() + 12
        }
    }
    println(scores.max())
}

private fun IntArray.homework(n: Int) = (2 + count { it == n }) * n
private fun IntArray.calcFourOfAKind() = filter { n -> count { it == n } >= 2 }.run { if (isNotEmpty()) get(0) * 4 else 0 }
private fun IntArray.calcFullHouse() = if (size == 1) if (sum() == 6) 28 else 12 + sum() * 3 else if (size == 2) max() * 3 + min() * 2 else 0
private fun IntArray.calcLittleStraight() = if (size == 3 && !contains(6)) 30 else 0
private fun IntArray.calcBigStraight() = if (size == 3 && !contains(1)) 30 else 0
private fun IntArray.calcYacht() = if (size == 1) 50 else 0