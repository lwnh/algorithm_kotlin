/**
 * 3개의 주사위를 던져 상금을 받는 게임
 *  - 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원
 *  - 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원
 *  - 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원
 * https://www.acmicpc.net/problem/2480
 */

fun main() {
    var diceList = readLine()!!.split(' ').map { it.toInt() }
    val (a, b, c) = diceList

    if (a == b && b == c) {
        println(10000 + a * 1000)
    } else if (a == b || a == c) {
        println(1000 + a * 100)
    } else if (b == c) {
        println(1000 + b * 100)
    } else {
//        println(diceList.max()!! * 100)
        var max: Int
        if (a < c && b < c) {
            max = c
        } else if (a > b && a > c) {
            max = a
        } else {
            max = b
        }
        println(max * 100)
    }
}

