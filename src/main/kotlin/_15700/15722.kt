package _15700

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val time = readLine().toInt()
    val layer = ((sqrt(4.0 * time + 1) - 1) / 2).toInt()
    val length = layer + 1
    val positionInLayer = time - layer * (layer + 1)
    val offset = (layer + 1) / 2
    println(if (layer and 1 == 0) {
        if (positionInLayer <= length) "${-offset} ${positionInLayer - offset}"
        else "${positionInLayer - length - offset} ${length - offset}"
    } else {
        if (positionInLayer <= length) "$offset ${offset - positionInLayer}"
        else "${offset - positionInLayer + length} ${offset - length}"
    })
}