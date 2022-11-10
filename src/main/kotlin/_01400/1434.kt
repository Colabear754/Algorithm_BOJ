package _01400

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    br.readLine()
    val box = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val book = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    var rest = 0    // 잔여 공간
    for (i in box.indices) {
        while (book.size > 0) {
            if (box[i] >= book[0]) {    // 박스 공간이 책 크기보다 크면 책을 넣고
                box[i] -= book[0]
                book.removeAt(0)
            } else {    // 그렇지 않으면 다음 박스로 넘어감
                break
            }
        }
        rest += box[i]
    }
    bw.write("${rest}\n")
    bw.flush()
    bw.close()
    br.close()
}