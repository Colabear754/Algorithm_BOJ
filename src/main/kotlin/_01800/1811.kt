package _01800

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var s: String
    while (readLine().also { s = it } != "#") {
        var (b, g, w) = IntArray(3)
        val (p, t) = s.split(" ")
        var pCheck = StringBuilder(p)
        var tCheck = StringBuilder(t)
        // black
        for (i in p.indices) {
            if (pCheck[i] == tCheck[i]) {
                pCheck[i] = '*'
                tCheck[i] = '*'
                b++
            }
        }
        // 모든 문자가 체크되면 이후의 계산은 불필요하므로 다음 케이스로 넘어감
        if (!pCheck.contains("[^*]".toRegex())) {
            bw.write("${t}: $b black, $g grey, $w white\n")
            continue
        }
        // outofindex 방지
        pCheck = StringBuilder(" $pCheck ")
        tCheck = StringBuilder(" $tCheck ")
        // grey
        for (i in 1 until pCheck.lastIndex) {
            if (tCheck[i] != '*' && pCheck[i - 1] == tCheck[i]) {
                pCheck[i - 1] = '*'
                tCheck[i] = '*'
                g++
            }
            if (tCheck[i] != '*' && pCheck[i + 1] == tCheck[i]) {
                pCheck[i + 1] = '*'
                tCheck[i] = '*'
                g++
            }
        }
        // 모든 문자가 체크되면 이후의 계산은 불필요하므로 다음 케이스로 넘어감
        if (!pCheck.contains("[^*\\s]".toRegex())) {
            bw.write("${t}: $b black, $g grey, $w white\n")
            continue
        }
        //  outofindex 방지를 위해 넣은 공백 제거
        pCheck = StringBuilder(pCheck.toString().trim())
        tCheck = StringBuilder(tCheck.toString().trim())

        // white
        for (i in pCheck.indices) {
            if (pCheck[i] != '*' && tCheck.contains(p[i])) {
                w++
            }
        }

        bw.write("${t}: $b black, $g grey, $w white\n")
    }
    bw.flush()
    bw.close()
}