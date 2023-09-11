package lesson19

fun main() {
    val boots: Product = ClothProduct(
        id = 1,
        name = "Ботинки"
    )
    boots.printProductInfo()
    println()

    val pencil: Product = StationeryProduct(
        id = 2,
        name = "Ручка"
    )
    pencil.printProductInfo()
    println()

    val jam: Product = OtherProduct(
        id = 3,
        name = "Клубничное варенье"
    )
    jam.printProductInfo()
}

enum class InternetStoreCatalog(val values: String) {
    CLOTH("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное")
}

fun getNameCategory(category: InternetStoreCatalog) {
    when (category) {
        InternetStoreCatalog.CLOTH -> println(category.values)
        InternetStoreCatalog.STATIONERY -> println(category.values)
        InternetStoreCatalog.OTHER -> println(category.values)
    }
}

abstract class Product(
    val id: Int,
    val name: String,
    val category: InternetStoreCatalog
) {
    fun printProductInfo() {
        getNameCategory(category)
        println("ID товара: ${id}\nНазвание товара: ${name}\n")
    }
}


class ClothProduct(
    id: Int,
    name: String,
    category: InternetStoreCatalog = InternetStoreCatalog.CLOTH
) : Product(id, name, category)

class StationeryProduct(
    id: Int,
    name: String,
    category: InternetStoreCatalog = InternetStoreCatalog.STATIONERY
) : Product(id, name, category)

class OtherProduct(
    id: Int,
    name: String,
    category: InternetStoreCatalog = InternetStoreCatalog.OTHER
) : Product(id, name, category)