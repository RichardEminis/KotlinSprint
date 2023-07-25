package lesson5

import java.time.LocalDate

const val AGE_OF_MATURE: Int = 18

fun main() {
    println("Введите год рождения")
    val yearOfBirth: Int = readln().toInt()
    val currentYear: LocalDate = LocalDate.now()
    val year = currentYear.year

    if ((year - yearOfBirth) >= AGE_OF_MATURE) {
        println("Показать экран со скрытым контентом")
        println(
            """
            
            ( ＾▽＾)っ✂╰⋃╯
            ***попался дружок***
            "Уголовный кодекс Российской Федерации" от 13.06.1996 N 63-ФЗ. Статья 242.
        """.trimIndent()
        )
    } else {
        println("Доступ запрещен")
        println("***звоним твоей мамке***")
        println("( ಥ ʖ̯ ಥ)")
    }
}