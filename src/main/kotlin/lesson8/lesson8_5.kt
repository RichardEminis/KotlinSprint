package lesson8

fun main() {
    println("Введите количество ингрединтов, которые хотели бы добавить:")
    val numberOfIngredients = readln().toInt()
    var arrayOfIngredients: Array<String> = arrayOf()

    for (i in 0 until numberOfIngredients){
        println("Введите название инредиента:")
        var userIngredient = readln()
        arrayOfIngredients += userIngredient
    }
}