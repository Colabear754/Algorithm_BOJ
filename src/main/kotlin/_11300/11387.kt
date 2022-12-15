package _11300

import java.util.StringTokenizer
import kotlin.math.roundToLong

fun main() = with(System.`in`.bufferedReader()) {
    val players = Array(2) {
        readLine().let {
            StringTokenizer(it).run {
                Player(
                    nextToken().toInt(),
                    nextToken().toInt(),
                    nextToken().toDouble() / 100,
                    nextToken().toDouble() / 100,
                    nextToken().toDouble() / 100)
            }
        }
    }
    val weapons = Array(2) {
        readLine().let {
            StringTokenizer(it).run {
                Player(
                    nextToken().toInt(),
                    nextToken().toInt(),
                    nextToken().toDouble() / 100,
                    nextToken().toDouble() / 100,
                    nextToken().toDouble() / 100)
            }
        }
    }
    println(
        if ((players[0] - weapons[0] + weapons[1]).power > players[0].power) '+'
        else if ((players[0] - weapons[0] + weapons[1]).power < players[0].power) '-'
        else '0'
    )
    println(
        if ((players[1] - weapons[1] + weapons[0]).power > players[1].power) '+'
        else if ((players[1] - weapons[1] + weapons[0]).power < players[1].power) '-'
        else '0'
    )
}

class Player(var attack: Int, var strength: Int, var critical: Double, var criticalDamage: Double, var attackSpeed: Double) {
    val power
        get() = (attack * (1 + strength.toDouble() / 100) * ((1 - minOf(1.0, critical)) + minOf(1.0, critical) * criticalDamage) * (1 + attackSpeed)).roundToLong()

    operator fun plus(other: Player) = Player(
        this.attack + other.attack,
        this.strength + other.strength,
        this.critical + other.critical,
        this.criticalDamage + other.criticalDamage,
        this.attackSpeed + other.attackSpeed)

    operator fun minus(other: Player) = Player(
        this.attack - other.attack,
        this.strength - other.strength,
        this.critical - other.critical,
        this.criticalDamage - other.criticalDamage,
        this.attackSpeed - other.attackSpeed)
}