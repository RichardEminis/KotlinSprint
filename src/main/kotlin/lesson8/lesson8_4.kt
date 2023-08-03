package lesson8

fun main () {
    var arrayOfIngredients = arrayOf("Морковь", "Свекла", "Помидоры", "Мазик", "Соль", "Любовь")

    for (i in arrayOfIngredients) {
        println(i)
    }

    println("Введите ингредиент, который хотели бы заменить:")
    val ingredient = readln()

    if (arrayOfIngredients.contains(ingredient) != true){
        println("Такого ингредиента в рецепте нет")
        return
    }

    println("Введите название ингредиента, который хотели бы добавить")
    val newIngredient = readln()

    arrayOfIngredients[arrayOfIngredients.indexOf(ingredient)] = newIngredient

    println("Готово! Вы сохранили следующий список:")
    for (i in arrayOfIngredients) {
        println(i)
    }
}