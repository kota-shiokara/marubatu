package data

sealed class Result {
    object Win: Result()

    object Lose: Result()

    object Draw: Result()

    object Within: Result()

    fun getGameResult(): String{
        return when(this){
            Win -> {
                "WIN"
            }
            Lose -> {
                "LOSE"
            }
            Draw -> {
                "DRAW"
            }
            else -> {
                "予期せぬバグが発生しました"
            }
        }
    }
}
