package _10500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val notes = IntArray(1001)
        repeat(readLine().toInt()) { notes[readLine().toInt()]++ }
        var max = 0
        var result = 0
        for (i in notes.indices) {
            if (notes[i] > max) {
                max = notes[i]
                result = i
            }
        }
        bw.write("$result")
        bw.newLine()
    }
    bw.close()
}