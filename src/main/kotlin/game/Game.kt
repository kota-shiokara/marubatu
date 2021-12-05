package game

import data.GameState
import processing.core.*
import processing.core.PConstants.CENTER

class Game(val app: PApplet): GameBase {
    val widthCell: Float = app.width.toFloat() / 3
    val heightCell: Float = app.height.toFloat() / 3

    val gameMaster = GameMaster()

    override fun update(){
        gameMaster.update()
    }

    override fun display(){
        app.background(255f)
        // Line
        app.line(widthCell, 0f, widthCell, app.height.toFloat())
        app.line(widthCell * 2, 0f, widthCell * 2, app.height.toFloat())
        app.line(0f, heightCell, app.width.toFloat(), heightCell)
        app.line(0f, heightCell * 2, app.width.toFloat(), heightCell * 2)

        app.ellipseMode(CENTER)
        app.fill(0f, 0f)
        for((i, row) in gameMaster.board.withIndex()){
            for((j, cell) in row.withIndex()){
                if(cell != 0) {
                    if(cell == 1) {
                        app.stroke(255f, 0f, 0f)
                        app.ellipse((widthCell / 2) + i * widthCell, (heightCell / 2) + j * heightCell, widthCell / 2, heightCell / 2)
                        app.stroke(0f)
                    } else {
                        app.stroke(0f, 0f, 255f)
                        app.line(i * widthCell, j * heightCell, (i * widthCell) + widthCell, (j * heightCell) + heightCell)
                        app.line((i * widthCell) + widthCell, j * heightCell, i * widthCell, (j * heightCell) + heightCell)
                        app.stroke(0f)
                    }
                    //app.text(gameMaster.symbolChar(cell), i * widthCell, j * heightCell)
                }
            }
        }

        if(gameMaster.state == GameState.GameFin){
            if(gameMaster.result.getGameResult() == "WIN") app.fill(255f, 0f, 0f)
            else app.fill(0f, 0f, 255f)
            app.textSize(60f)
            app.textMode(CENTER)
            app.textAlign(CENTER)
            app.text(gameMaster.result.getGameResult(), app.width.toFloat() / 2, app.height.toFloat() / 2)
        }
    }

    fun onClick(x: Int, y: Int){
        gameMaster.onClick(x, y)
    }

    fun restart(){
       gameMaster.restart()
    }
}