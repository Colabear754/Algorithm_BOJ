package _02900

fun main() = with(System.`in`.bufferedReader()) {
    val b = readLine().toCharArray().sortedArray()
    val digitsOfOne = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    val digitsOfTen = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    for (i in 1..99) {
        val current = "${digitsOfTen[i / 10]}${digitsOfOne[i % 10]}"
        if (current.toCharArray().sortedArray().contentEquals(b)) {
            println(current)
            break
        }
    }
}