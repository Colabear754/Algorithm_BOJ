package _01200

fun main() {
    val name = readln()
    val n = readln().toInt()
    val team = Array(n) { "" }
    val love = IntArray(4)
    var max = 0
    var chance = 1

    if (n == 1) {
        println(readln())
        return
    }

    for (i in team.indices) {
        team[i] = readln()
    }

    team.sort()

    for (i in team.indices) {
        love[0] = name.count { c -> c == 'L' } + team[i].count { c -> c == 'L' }
        love[1] = name.count { c -> c == 'O' } + team[i].count { c -> c == 'O' }
        love[2] = name.count { c -> c == 'V' } + team[i].count { c -> c == 'V' }
        love[3] = name.count { c -> c == 'E' } + team[i].count { c -> c == 'E' }
        for (j in 0 until love.lastIndex) {
            for (k in j + 1 .. love.lastIndex) {
                chance *= (love[j] + love[k])
            }
        }
        if (chance % 100 > max) {
            max = chance % 100
            team[0] = team[i]
        }
        chance = 1
    }

    println(team[0])
}