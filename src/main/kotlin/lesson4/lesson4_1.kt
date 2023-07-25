package lesson4

const val NUMBER_OF_TABLES: Int = 13
fun main() {
    val reservedTablesToday: Int = 13
    val reservedTablesTomorrow: Int = 9
    var freeTables: Boolean = reservedTablesToday < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $freeTables")

    freeTables = reservedTablesTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на завтра: $freeTables")
}