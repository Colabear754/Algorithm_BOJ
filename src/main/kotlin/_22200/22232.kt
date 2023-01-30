package _22200

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val files = Array(n) { readLine() }
    val extensions = HashSet<String>()
    val pq = PriorityQueue<File>()
    for (i in 1..m) {
        extensions.add(readLine())
    }
    for (i in files.indices) {
        StringTokenizer(files[i], ".").apply {
            val name = nextToken()
            val extension = nextToken()
            val isRecognized = if (extensions.contains(extension)) 1 else 0
            pq.add(File(name, extension, isRecognized))
        }
    }
    while (pq.isNotEmpty()) {
        bw.write("${pq.poll()}\n")
    }
    bw.close()
}

private class File(val name: String, val extension: String, val isRecognized: Int) : Comparable<File> {
    override fun compareTo(other: File) = if (this.name == other.name) {
        if (this.isRecognized == other.isRecognized) {
            this.extension.compareTo(other.extension)
        } else {
            other.isRecognized - this.isRecognized
        }
    } else
        this.name.compareTo(other.name)

    override fun toString(): String {
        return "$name.$extension"
    }
}