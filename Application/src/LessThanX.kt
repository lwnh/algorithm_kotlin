/**
 * 정수 N개로 이루어진 수열 A에서 X보다 작은 수를 모두 출력
 *  - 첫째 줄에 정수 N과 X를 입력 받는다. (1 ≤ N, X ≤ 10,000)
 *  - 둘째 줄에 수열 A를 입력 받는다.
 * https://www.acmicpc.net/problem/10871
 */

fun main() {
    val (N, X) = readLine()!!.split(' ').map { it.toInt() }
    val numList = readLine()!!.split(' ').map { it.toInt() }
    var newList = arrayListOf<Int>()

    numList.forEach { num ->
        if (num < X) newList.add(num)
    }

    print(newList.joinToString(" "))
}