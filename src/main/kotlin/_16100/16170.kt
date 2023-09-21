package _16100

import java.time.*
fun main()=print(LocalDate.now(ZoneId.of("UTC+0")).run{"$year\n$monthValue\n$dayOfMonth"})