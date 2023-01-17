package _01200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val hotKeys = HashSet<Char>()
    loop@ for (i in 1..n) {
        val optionWords = readLine().split(' ').toMutableList()
        for (j in optionWords.indices) {
            if (hotKeys.add(optionWords[j][0].lowercaseChar())) {
                optionWords[j] = "[${optionWords[j][0]}]${optionWords[j].substring(1)}"
                bw.write("${optionWords.joinToString(" ")}\n")
                continue@loop
            }
        }

        for (j in optionWords.indices) {
            for (k in optionWords[j].indices) {
                if (hotKeys.add(optionWords[j][k].lowercaseChar())) {
                    optionWords[j] = "${optionWords[j].slice(0 until k)}[${optionWords[j][k]}]${optionWords[j].substring(k + 1)}"
                    bw.write("${optionWords.joinToString(" ")}\n")
                    continue@loop
                }
            }
        }

        bw.write("${optionWords.joinToString(" ")}\n")
    }
    bw.close()
}