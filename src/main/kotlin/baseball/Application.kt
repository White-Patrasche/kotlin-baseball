package baseball


fun main() {
    println("숫자 야구 게임을 시작합니다.")
    while(true) {
        val computerNum = pickComputerNumber()
        playGame(computerNum)
        println("숫자 3개를 모두 맞히셨습니다! 게임 종료")
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        if(isFinishGame()) {
            break
        }
    }

}

