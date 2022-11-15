package _01800

fun main() = with(System.`in`.bufferedReader()) {
    val c = readLine().toInt()
    val bw = System.out.bufferedWriter()
    val isPrime = BooleanArray(1000001) { true }    // 100만 이하의 소수 판별을 위한 배열
    val prime = ArrayList<Int>()    // 100만 이하의 소수를 저장할 list
    var a = 2
    // 100만 이하의 소수 판별
    while (a * a <= 1000000) {
        for (j in a*a..1000000 step a) {
            isPrime[j] = false
        }
        a++
    }
    // 100만 이하의 소수 저장
    for (i in 2..1000000) {
        if (isPrime[i]) prime.add(i)
    }
    // 암호 키 계산 시작
    root@ for (i in 0 until c) {
        val n = readLine().toLong()
        // prime에 저장된 소수로 한번이라도 나눠지면 no
        for (div in prime) {
            if (n % div == 0L) {
                bw.write("NO\n")
                continue@root
            }
        }
        // 아니면 yes
        bw.write("YES\n")
    }
    bw.flush()
    bw.close()
}