package lesson4

fun main() {
    val numberOfTables: Int = 13
    val reservedTablesToday: Int = 13
    val reservedTablesTomorrow: Int = 9
    var freeTables: Boolean = reservedTablesToday < numberOfTables

    println("Доступность столиков на сегодня: $freeTables")

    freeTables = reservedTablesTomorrow < numberOfTables

    println("Доступность столиков на завтра: $freeTables")
}