/**
 * 1부터 N까지의 한수 구하기
 * https://www.acmicpc.net/problem/1065
 */

fun main() {
    val num = readLine()!!.toInt()
    var total = 0

    for (i in 1..num) {
        total += getNum(i)
    }

    print(total)
}

fun getNum(num: Int): Int {
    var number = num
    var count = 0
    var array = emptyArray<Int>()

    if (number < 100) {
        count++
    } else if (number < 1000) {
        while (true) {
            if (number == 0) break
            array = array.plus(number % 10)
            number /= 10
        }
        if (array[0] - array[1] == array[1] - array[2]) {
            count++
        }
    }

    return count
}

