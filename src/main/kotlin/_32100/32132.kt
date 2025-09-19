package _32100

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    var string = readLine()
    while ("PS4" in string || "PS5" in string) {
        string = string.replace("PS4", "PS").replace("PS5", "PS")
    }
    println(string)
}