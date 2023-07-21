package lesson2

fun main() {
    val ironOre: Int = 11
    val crystalОre: Int = 7
    val buffOfIron: Double = (ironOre / 100.0) * 20
    val buffOfCristal: Double = (crystalОre / 100.0) * 20

    println("Добыто железной руды = $ironOre; Добыто руды под баффом = ${ironOre + buffOfIron.toInt()}; Бонус = ${buffOfIron.toInt()}")
    println("Добыто кристаллической руды = $crystalОre; Добыто руды под баффом = ${crystalОre + buffOfCristal.toInt()}; Бонус = ${buffOfCristal.toInt()}")
}