package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (a, b) = readLine().split(' ')
    var aIndex = -1
    var bIndex = -1
    for (i in a.indices) {
        val indexOf = b.indexOf(a[i])
        if (indexOf != -1) {
            aIndex = i
            bIndex = indexOf
            break
        }
    }
    for (i in b.indices) {
        for (j in a.indices) {
            bw.write(when {
                i == bIndex -> "${a[j]}"
                j == aIndex -> "${b[i]}"
                else -> "."
            })
        }
        bw.newLine()
    }
    bw.close()
}