package _01100

fun main() {
    var result = 0
    for (i in 0 until 8) {
        val line = readln().toCharArray()
        if (i % 2 == 0) {
            for (j in line.indices step 2) {
                result += if (line[j] == 'F') 1 else 0
            }
        } else {
            for (j in 1 until line.size step 2) {
                result += if (line[j] == 'F') 1 else 0
            }
        }
    }

    println(result)
}