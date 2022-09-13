/**
 * 알람 설정 - 입력받은 시간(두 정수 H, M)을 45분 앞으로 변경하기 (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
 * https://www.acmicpc.net/problem/2884
 */

fun main() {
    var (H, M) = readLine()!!.split(' ').map { it.toInt() }

    if (M < 45) {
        M += 60
        H = if (H == 0) 23 else H - 1
    }
    M -= 45

    println("$H $M")
}
