package lesson9

fun main () {
    val friedEggsRecipe = mapOf("Яйца" to 2, "Молоко" to 50, "Сливочное масло" to 15)

    println("Сколько порций вам необходимо?")
    val portions = readln().toInt()

    val newFriedEggsRecipe = friedEggsRecipe.map{
        it.key to it.value * portions
    }.toMap()

    println("На $portions порций вам понадобится: Яиц – ${newFriedEggsRecipe["Яйца"]}, " +
            "молока – ${newFriedEggsRecipe["Молоко"]}, " +
            "сливочного масла – ${newFriedEggsRecipe["Сливочное масло"]}")
}