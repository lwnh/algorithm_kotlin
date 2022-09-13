/**
 * 오른쪽 정렬 별 찍기
 * https://www.acmicpc.net/problem/2439
 */

fun main() {
    val size = readLine()!!.toInt()

    for (i in 1..size) {
        for (j in 0 until size - i) {
            print(" ")
        }
        for (j in 1..i) {
            print("*")
        }
        if (i != size) println()
    }
}