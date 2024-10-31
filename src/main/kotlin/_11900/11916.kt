package _11900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pitchings = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var ballCount = 0
    val runnerStatus = BooleanArray(3)
    var score = 0
    fun run() {
        if (runnerStatus[1] && runnerStatus[0]) {
            if (runnerStatus[2]) score++
            runnerStatus[2] = true
            return
        }
        if (runnerStatus[0]) {
            runnerStatus[1] = true
            return
        }
        runnerStatus[0] = true
    }
    fun wildPitch(isHitterRun: Boolean) {
        if (runnerStatus[2]) score++
        runnerStatus[2] = runnerStatus[1]
        runnerStatus[1] = runnerStatus[0]
        runnerStatus[0] = isHitterRun
    }
    for (pitching in pitchings) {
        when (pitching) {
            1 -> if (++ballCount == 4) {
                run()
                ballCount = 0
            }
            2 -> run().also { ballCount = 0 }
            3 -> wildPitch(++ballCount == 4).also { if (ballCount == 4) ballCount = 0 }
        }
    }
    println(score)
}