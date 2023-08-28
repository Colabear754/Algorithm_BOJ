package _06500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var firstInput: String?
    while (!readLine().also { firstInput = it }.isNullOrEmpty()) {
        val memory = intArrayOf(firstInput!!.toInt(2)) + IntArray(31) { readLine().toInt(2) }
        var pc = 0
        var adder = 0
        while (true) {
            val opperator = memory[pc] / 32
            val operand = memory[pc++] % 32
            pc %= 32
            when (opperator) {
                0 -> memory[operand] = adder
                1 -> adder = memory[operand]
                2 -> if (adder == 0) pc = operand
                3 -> continue
                4 -> adder = (adder + 255) % 256
                5 -> adder = (adder + 1) % 256
                6 -> pc = operand
                7 -> break
            }
        }
        bw.write("${adder.toString(2).padStart(8, '0')}\n")
    }
    bw.close()
}