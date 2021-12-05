import game.Game
import data.GameState
import processing.core.*

class Marubatu : PApplet(){
    private lateinit var game: Game
    override fun settings() {
        size(600, 600)
    }

    override fun setup() {
        background(255)
        game = Game(this)
    }

    override fun draw() {
        game.update()
        game.display()
    }

    override fun mouseClicked() {
        super.mouseClicked()
        if(game.gameMaster.state == GameState.Standby){
            when{
                mouseX < game.widthCell -> {
                    when{
                        mouseY < game.heightCell -> {
                            game.onClick(0, 0)
                        }
                        mouseY < game.heightCell * 2 -> {
                            game.onClick(0, 1)
                        }
                        else -> {
                            game.onClick(0, 2)
                        }
                    }
                }

                mouseX < game.widthCell * 2 -> {
                    when{
                        mouseY < game.heightCell -> {
                            game.onClick(1, 0)
                        }
                        mouseY < game.heightCell * 2 -> {
                            game.onClick(1, 1)
                        }
                        else -> {
                            game.onClick(1, 2)
                        }
                    }
                }

                else -> {
                    when{
                        mouseY < game.heightCell -> {
                            game.onClick(2, 0)
                        }
                        mouseY < game.heightCell * 2 -> {
                            game.onClick(2, 1)
                        }
                        else -> {
                            game.onClick(2, 2)
                        }
                    }
                }
            }
        }
        else if(game.gameMaster.state == GameState.GameFin){
            game.restart()
        }
    }
}

fun main() {
    PApplet.main(Marubatu::class.java.simpleName)
}