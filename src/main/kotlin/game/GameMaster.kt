package game

import data.GameState
import data.Result

class GameMaster() {
    var tern: Int = 1
    var state: GameState = GameState.Standby
    var board: Array<Array<Int>> = Array(3){ Array(3){ 0 } }
    var result: Result = Result.Draw

    fun update(){
        when(state){
            GameState.Standby -> {

            }
            GameState.NextTern -> {

                if(tern == 1) {
                    tern++
                } else {
                    tern = 1
                }

                result = onCheckGame()
                state = if(result == Result.Within){
                    GameState.Standby
                } else {
                    GameState.GameFin
                }
            }
            GameState.GameFin -> {
                println(result.getGameResult())
            }
        }
    }

    private fun updateBoard(x: Int, y: Int): Boolean{
        return if(board[x][y] == 0){
            board[x][y] = tern
            true
        } else {
            false
        }
    }

    fun onClick(x: Int, y: Int){
        val checkUpdate = updateBoard(x, y)
        if(checkUpdate) {
            state = GameState.NextTern
        }
    }

    fun symbolChar(state: Int): Char{
        return if(state == 1){
            'O'
        } else {
            'X'
        }
    }

    fun onCheckGame(): Result{
        if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            return Result.Win
        } else if(board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2){
            return Result.Lose
        }
        if(board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
            return Result.Win
        } else if(board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2){
            return Result.Lose
        }
        for((i, row) in board.withIndex()) {
            if(row.contentEquals(arrayOf(1, 1, 1))) {
                return Result.Win
            } else if(row.contentEquals(arrayOf(2, 2, 2))) {
                return Result.Lose
            }
            if(board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) {
                return Result.Win
            } else if(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2) {
                return Result.Lose
            }
        }

        var fin = 0
        board.forEach { it.forEach { value -> if(value != 0) fin+=1 } }
        if(fin == 9) {
            return Result.Draw
        }

        return Result.Within
    }

    fun restart(){
        tern = 1
        board = Array(3){ Array(3){ 0 } }
        state = GameState.Standby
        result = Result.Within
    }
}