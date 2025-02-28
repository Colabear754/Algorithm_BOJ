package _13000

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine()
    val counts = IntArray(4)
    var prev = ' '
    input.forEach {
        when (it) {
            'w' -> if (prev != ' ' && prev != 'w' && prev != 'f') return@with println(0) else counts[0]++
            'o' -> if (prev != 'w' && prev != 'o') return@with println(0) else counts[1]++
            'l' -> if (counts[0] != counts[1] || (prev != 'o' && prev != 'l')) return@with println(0) else counts[2]++
            'f' -> if (counts[0] != counts[1] || counts[1] != counts[2] || (prev != 'l' && prev != 'f')) return@with println(0)
            else {
                counts[3]++
                if (counts[0] == counts[3]) return@forEach counts.fill(0).also { prev = ' ' }
            }
        }
        prev = it
    }
    println(if (prev == ' ') 1 else 0)
}