package lesson8

fun main () {
    val arrayOfIngredients = arrayOf("Морковь", "Свекла", "Помидоры", "Мазик", "Соль", "Любовь")

    println("Введите искомый ингредиент:")
    val ingredient = readln()

    if (arrayOfIngredients.contains(ingredient)){
        println("Ингредиент [$ingredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}