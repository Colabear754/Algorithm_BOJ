package _26200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val answers = readLine()
    val bigdata = answers.replace("bigdata", "*").count { it == '*' }
    val security = n - bigdata
    println(if (bigdata > security) "bigdata?" else if (bigdata < security) "security!" else "bigdata? security!")
}