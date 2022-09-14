/**
 * 세준이 기말고사 점수 바꾸기
 * https://www.acmicpc.net/problem/1546
 */

fun main() {
    val subjectNum = readLine()!!.toInt()
    var scoreList = readLine()!!.split(' ').map { it.toDouble() }

    var maxScore = 0.0
    scoreList.forEach {
        if (maxScore < it) {
            maxScore = it
        }
    }
    var total = 0.0


    scoreList.map { it / maxScore.toDouble() * 100 }
            .forEach { total += it }

    print(total / subjectNum)
}

