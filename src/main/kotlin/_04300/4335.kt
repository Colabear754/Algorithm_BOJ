package _04300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val notAnswer = BooleanArray(11)
    var input: String
    while (readLine().also { input = it } != "0") {
        val n = input.toInt()
        val stan = readLine()
        when (stan) {
            "too high" -> for (i in n..10) notAnswer[i] = true
            "too low" -> for (i in 1..n) notAnswer[i] = true
            "right on" -> {
                bw.write(if (notAnswer[n]) "Stan is dishonest\n" else "Stan may be honest\n")
                notAnswer.fill(false)
            }
        }
    }
    bw.close()
}