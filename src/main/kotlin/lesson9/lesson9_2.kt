package lesson9

fun main() {
    var listOfIngredients = mutableListOf("Картошка", "Вода", "Банан")

    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }

    println("Желаете добавить еще?")
    var answer = readln()

    if (answer == "да"){
        println("Какой ингредиент вы хотите добавить?")
        answer = readln()
        listOfIngredients.add(answer)
        println("Теперь в рецепте есть следующие ингредиенты:")
        listOfIngredients.forEach {
            println(it)
        }
    }
}