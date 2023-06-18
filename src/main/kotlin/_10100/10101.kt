package _10100

fun main() = with(System.`in`.bufferedReader()) {
    val triangle = IntArray(3) { readLine().toInt() }
    println(when (triangle.sum()) {
        180 -> when {
            triangle.count { it == 60 } == 3 -> "Equilateral"
            triangle[0] == triangle[1] || triangle[1] == triangle[2] || triangle[2] == triangle[0] -> "Isosceles"
            else -> "Scalene"
        }
        else -> "Error"
    })
}