package data

sealed class GameState {
    object Standby: GameState()
    object NextTern: GameState()
    object GameFin: GameState()
}
