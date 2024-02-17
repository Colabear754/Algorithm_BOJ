package _10700

fun main() = with(System.`in`.bufferedReader()) {
    readLine().run {
        val happy = split(":-)").size - 1
        val sad = split(":-(").size - 1
        println(when {
            happy + sad == 0 -> "none"
            happy == sad -> "unsure"
            happy > sad -> "happy"
            else -> "sad"
        })
    }
}