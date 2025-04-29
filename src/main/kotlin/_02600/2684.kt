package _02600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = IntArray(8)
    repeat(readLine().toInt()) {
        val case = readLine()
        for (i in 0..37) {
            when (case[i]) {
                'H' -> when (case[i + 1]) {
                    'H' -> if (case[i + 2] == 'H') cases[7]++ else cases[6]++
                    'T' -> if (case[i + 2] == 'H') cases[5]++ else cases[4]++
                }
                'T' -> when (case[i + 1]) {
                    'H' -> if (case[i + 2] == 'H') cases[3]++ else cases[2]++
                    'T' -> if (case[i + 2] == 'H') cases[1]++ else cases[0]++
                }
            }
        }
        bw.write("${cases.joinToString(" ")}\n")
        cases.fill(0)
    }
    bw.close()
}