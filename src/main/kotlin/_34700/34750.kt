package _34700

fun main() = with(System.`in`.bufferedReader()) {
    val pocketMoney = readLine().toInt()
    val toParents = when (pocketMoney) {
        in 50000..<100000 -> pocketMoney / 20
        in 100000..<500000 -> pocketMoney / 10
        in 500000..<1000000 -> pocketMoney * 3 / 20
        else -> pocketMoney / 5
    }
    println("$toParents ${pocketMoney - toParents}")
}