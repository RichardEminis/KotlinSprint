package lesson9

fun main() {
    var listOfIngredients = listOf("Картошка", "Редис", "Вода", "Банан")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach{
        println(it)
    }
}