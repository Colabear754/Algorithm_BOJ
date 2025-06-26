package _11300

import java.math.BigDecimal
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val players = Array(2) {
        readLine().let {
            StringTokenizer(it).run {
                Player(
                    BigDecimal(nextToken()),
                    BigDecimal(nextToken()),
                    BigDecimal(nextToken()).divide(100.toBigDecimal()),
                    BigDecimal(nextToken()).divide(100.toBigDecimal()),
                    BigDecimal(nextToken()).divide(100.toBigDecimal())
                )
            }
        }
    }
    val weapons = Array(2) {
        readLine().let {
            StringTokenizer(it).run {
                Player(
                    BigDecimal(nextToken()),
                    BigDecimal(nextToken()),
                    BigDecimal(nextToken()).divide(100.toBigDecimal()),
                    BigDecimal(nextToken()).divide(100.toBigDecimal()),
                    BigDecimal(nextToken()).divide(100.toBigDecimal()))
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

private class Player(var attack: BigDecimal,
             var strength: BigDecimal,
             var critical: BigDecimal,
             var criticalDamage: BigDecimal,
             var attackSpeed: BigDecimal) {
    val power
        get() = attack *
                (1.toBigDecimal() + strength.divide(100.toBigDecimal())) *
                ((1.toBigDecimal() - minOf(BigDecimal(1), critical)) + minOf(BigDecimal(1), critical) * criticalDamage) *
                (1.toBigDecimal() + attackSpeed)

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