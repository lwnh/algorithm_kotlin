/**
 * 셀프 넘버 구하기
 * https://www.acmicpc.net/problem/4673
 */

fun main() {
    val fullList = (1..10000).toList()
    var numList = arrayListOf<Int>()

    for (i in 1..10000) {
        numList.add(getSum(i))
    }

    fullList.filter { !numList.contains(it) }
            .forEach { println(it) }
}

fun getSum(num: Int): Int {
    var number = num
    var sum = num

    while (true) {
        if (number == 0) break
        sum += number % 10
        number /= 10

    }
    return sum
}