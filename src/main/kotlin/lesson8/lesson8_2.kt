package lesson8

fun main () {
    val arrayOfIngredients = arrayOf("Морковь", "Свекла", "Помидоры", "Мазик", "Соль", "Любовь")
    var findStatus: Boolean = false

    println("Введите искомый ингредиент:")
    val ingredient = readln()

    for (i in arrayOfIngredients){
        if (i == ingredient){
            findStatus = true
            continue
        }
    }
    if (findStatus == true){
        println("Ингредиент [$ingredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
