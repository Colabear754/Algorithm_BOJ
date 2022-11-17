package _01800

fun main() = with(System.out.bufferedWriter()) {
    var s: String?
    while (readLine().also { s = it } != null) {
        val list = s!!.split(" ").map { it.toDouble() }
        val points = ArrayList<Point>()
        for (i in list.indices step 2) {
            val tmp = Point(list[i], list[i + 1])
            if (!points.contains(tmp)) {
                points.add(tmp)
            } else if (points.indexOf(tmp) != 1) {  // 추가하려는 점이 중복되는 경우엔 중복되는 점이 P2인지 체크하고 아닐 경우엔 P1과 자리를 바꿈
                points[0] = points[1]
                points[1] = tmp
            }
        }
        val x = points[0].x + points[2].x - points[1].x
        val y = points[0].y + points[2].y - points[1].y
        write("${Point(x, y)}\n")
    }
    close()
}

class Point(val x: Double, val y: Double) {
    override fun toString() = "%.3f %.3f".format(x, y)
    // x, y좌표가 같으면 같은 객체로 처리하기 위한 override 메소드들
    override fun equals(other: Any?) = (other as Point).x == this.x && other.y == this.y
    override fun hashCode() = 31 * x.hashCode() + y.hashCode()
}