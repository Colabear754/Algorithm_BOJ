package _28100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val str = readLine().replace("\\\\'", "#")
            .replace("\\'", "%")
            .toCharArray()
        var count = 0
        for (i in str.indices) {
            when (str[i]) {
                '@', '[', '!', ';', '^', '0', '7', '%', '#' -> count++
            }
            if (count >= str.size / 2.0) {
                bw.write("I don't understand\n")
                return@repeat
            }
            when (str[i]) {
                '@' -> str[i] = 'a'
                '[' -> str[i] = 'c'
                '!' -> str[i] = 'i'
                ';' -> str[i] = 'j'
                '^' -> str[i] = 'n'
                '0' -> str[i] = 'o'
                '7' -> str[i] = 't'
                '%' -> str[i] = 'v'
                '#' -> str[i] = 'w'
            }
        }
        bw.write("${str.joinToString("")}\n")
    }
    bw.close()
}