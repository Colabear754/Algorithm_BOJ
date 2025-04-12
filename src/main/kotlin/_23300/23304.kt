package _23300

fun main() = with(System.`in`.bufferedReader()) {
    println(if (readLine().isAkaraka()) "AKARAKA" else "IPSELENTI")
}

private fun String.isAkaraka(start: Int = 0, end: Int = lastIndex): Boolean {
    if (end - start <= 1) return true
    if (!isPalindrome(start, end)) return false
    val half = (end - start + 1) / 2
    return isAkaraka(start, start + half - 1) && isAkaraka(end - half + 1, end)
}

private fun String.isPalindrome(start: Int, end: Int): Boolean {
    var left = start
    var right = end
    while (left < right) {
        if (this[left] != this[right]) return false
        left++
        right--
    }
    return true
}