package _27800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val stations = Array(1 shl 9) { HashSet<String>() }
    val lastFeatures = HashMap<String, Int>()
    repeat(n) {
        val station = readLine()
        lastFeatures[station] = 0
    }
    val r = readLine().toInt()
    val featureKeys = HashMap<String, Int>()
    var next = 0
    repeat(r) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "U" -> {
                    val station = nextToken()
                    val st = StringTokenizer(nextToken(), ",")
                    var newFeature = 0
                    while (st.hasMoreTokens()) {
                        val feature = st.nextToken()
                        if (!featureKeys.containsKey(feature)) featureKeys[feature] = 1 shl next++
                        newFeature = newFeature or (featureKeys[feature] ?: 0)
                    }
                    stations[lastFeatures[station] ?: 0].remove(station)
                    stations[newFeature].add(station)
                    lastFeatures[station] = newFeature
                }
                "G" -> {
                    val st = StringTokenizer(nextToken(), ",")
                    var findFeatures = 0
                    while (st.hasMoreTokens()) {
                        val feature = st.nextToken()
                        if (!featureKeys.containsKey(feature)) {
                            bw.write("0\n")
                            return@repeat
                        }
                        findFeatures = findFeatures or (featureKeys[feature] ?: 0)
                    }
                    var count = 0
                    for (i in stations.indices) {
                        if (i and findFeatures == findFeatures) count += stations[i].size
                    }
                    bw.write("$count")
                    bw.newLine()
                }
            }
        }
    }
    bw.close()
}