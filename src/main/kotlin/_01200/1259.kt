package _01200

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val n = readln()
        var check = true
        if (n == "0") {
            break
        }
        if (n.length % 2 == 1){
            // 길이가 홀수면 가운데 자리는 무시해도 됨
            for (i in 0 until n.lastIndex / 2) {
                if (n[i] != n[n.lastIndex - i]) {
                    writer.write("no\n")
                    check = false
                    break
                }
            }
        } else {
            // 길이가 짝수면 모든 인덱스를 비교
            for (i in 0..n.lastIndex / 2) {
                if (n[i] != n[n.lastIndex - i]) {
                    writer.write("no\n")
                    check = false
                    break
                }

            }
        }
        if (check) {
            writer.write("yes\n")
        }
    }
    writer.flush()
    writer.close()
}