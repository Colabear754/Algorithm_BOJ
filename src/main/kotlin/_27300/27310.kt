package _27300

fun main() {
    val emoji = readln()
    var difficulty = emoji.length + 2
    for (c in emoji) {
        if (c == '_') difficulty += 5
    }
    println(difficulty)
}