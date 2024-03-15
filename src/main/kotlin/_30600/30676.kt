package _30600

fun main() = with(System.`in`.bufferedReader()) {
    println(
        when (readLine().toInt()) {
            in 620..780 -> "Red"
            in 590..619 -> "Orange"
            in 570..589 -> "Yellow"
            in 495..569 -> "Green"
            in 450..494 -> "Blue"
            in 425..449 -> "Indigo"
            else -> "Violet"
        }
    )
}