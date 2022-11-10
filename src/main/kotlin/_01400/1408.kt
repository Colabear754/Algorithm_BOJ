package _01400

import java.text.SimpleDateFormat

fun main() {
    val sdf = SimpleDateFormat("HH:mm:ss")
    val time = arrayOf(sdf.parse(readln()).time, sdf.parse(readln()).time)
    println(sdf.format(time[1] - time[0]))
}