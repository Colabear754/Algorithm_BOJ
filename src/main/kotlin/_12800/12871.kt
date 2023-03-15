package _12800

fun main() = with(System.`in`.bufferedReader()) {
    val str1 = StringBuilder(readLine())
    val str2 = StringBuilder(readLine())
    val origin1 = str1.toString()
    val origin2 = str2.toString()
    while (str1.length != str2.length) {
        if (str1.length > str2.length) str2.append(origin2)
        if (str1.length < str2.length) str1.append(origin1)
    }
    println(if (str1.toString() == str2.toString()) 1 else 0)
}