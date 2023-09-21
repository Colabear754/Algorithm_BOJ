package _30000

import java.util.StringTokenizer
import kotlin.math.ceil

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toLong() }
    val tierMap = LinkedHashMap<String, Long>()
    for (i in 1..k) {
        StringTokenizer(readLine()).apply {
            val name = nextToken()
            nextToken().also {
                if (it.last() == '%') {
                    val percent = it.substring(0, it.length - 1).toLong()
                    val personnel = (n * percent / 100)
                    n -= personnel
                    tierMap[name] = personnel
                } else {
                    val personnel = minOf(n, it.toLong())
                    n -= personnel
                    tierMap[name] = personnel
                }
            }
        }
    }
    if (n != 0L) {
        println("Invalid System")
        return@with
    }
    val friendTier = readLine()
    if (friendTier.last() - '0' !in 1..4) {
        tierMap[friendTier]?.takeIf { it > 0 }
            ?.let {
                var start = 0L
                for ((key, value) in tierMap) {
                    if (key == friendTier) break
                    start += value
                }
                println("${start + 1} ${start + it}")
            } ?: run { println("Liar") }
    } else {
        val subtier = friendTier.last() - '0'
        val tierName = friendTier.substring(0, friendTier.length - 1)
        var tierPersonnel = tierMap[tierName] ?: run {
            println("Liar")
            return@with
        }
        val subTierPersonnelList = ArrayList<Long>()
        val subTierPersonnel = ceil(tierPersonnel / 4.0).toLong()
        while (tierPersonnel > 0) {
            if (tierPersonnel >= subTierPersonnel) {
                subTierPersonnelList.add(subTierPersonnel)
                tierPersonnel -= subTierPersonnel
            } else {
                subTierPersonnelList.add(tierPersonnel)
                break
            }
        }
        if (subtier > subTierPersonnelList.size) {
            println("Liar")
            return@with
        }
        var start = 0L
        for ((key, value) in tierMap) {
            if (key == tierName) break
            start += value
        }
        repeat(subtier - 1) { start += subTierPersonnelList[it] }
        println("${start + 1} ${start + subTierPersonnelList[subtier - 1]}")
    }
}