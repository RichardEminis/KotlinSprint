package lesson9

fun main () {
    val friedEggsRecipe = mapOf("Яйца" to 2, "Молоко" to 50, "Сливочное масло" to 15)

    println("Сколько порций вам необходимо?")
    val portions = readln().toInt()

    val newFriedEggsRecipe = friedEggsRecipe.map{
        it.key to it.value * portions
    }

    println("На $portions порций вам понадобится: Яиц – ${newFriedEggsRecipe.toMap().get("Яйца")}, " +
            "молока – ${newFriedEggsRecipe.toMap().get("Молоко")}, " +
            "сливочного масла – ${newFriedEggsRecipe.toMap().get("Сливочное масло")}]")
}