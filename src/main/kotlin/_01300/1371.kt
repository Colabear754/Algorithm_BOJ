package _01300

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var s: String
    val count = IntArray(26)
    while (true) {
        s = br.readLine() ?:break
        for (char in 'a'..'z') {
            count[char - 'a'] += s.count { c -> c == char }
        }
    }
    var max = 0
    for (n in count) {
        max = max(max, n)
    }
    for (i in count.indices) {
        if (count[i] == max) {
            print((i + 'a'.code).toChar())
        }
    }
}