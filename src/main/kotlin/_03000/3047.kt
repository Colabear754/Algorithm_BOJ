package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val abc = readLine().split(' ').map(String::toInt).sorted()
    readLine().forEach { bw.write("${abc[it - 'A']} ") }
    bw.close()
}