package _01200

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val military = HashMap<Military, Int>()
    repeat(readLine().toInt()) {
        System.gc()
        val st = StringTokenizer(readLine())
        val t = st.nextToken().toInt()
        var max = 0
        var strongest: Military? = null
        repeat(t) {
            st.nextToken().also {
                val tmp = if (it.first() == '-') Military(abs(it.toInt()).toUInt(), 1.toByte()) else Military(it.toUInt(), 0.toByte())
                military[tmp] = military[tmp]?.plus(1) ?: 1
                if ((military[tmp] ?: 0) > max) {
                    max = maxOf(max, military[tmp] ?: 0)
                    strongest = tmp
                }
            }
        }
        sb.append(
            if (max > t / 2)
                when (strongest?.sign ?: 0) {
                    1.toByte() -> "-${strongest}\n"
                    else -> "${strongest}\n"
                }
            else "SYJKGW\n")
        military.clear()
    }
    println(sb)
}

private class Military(var num: UInt, var sign: Byte) {
    override fun toString() = "${this.num}"
    override fun equals(other: Any?) = this.num == (other as Military).num && this.sign == other.sign
    override fun hashCode() = 31 * num.hashCode() + sign
}