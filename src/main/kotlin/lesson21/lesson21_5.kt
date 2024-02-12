package lesson21

fun main() {
    val character = Character()

    println(character.maxSkill())
}

class Character(
    private val playerSkills: Map<String, Int> = mapOf(
        "Программирование" to 120,
        "Скорость печати" to 110,
        "Железные ягодицы" to 120,
        "Общение с Google" to 110
    )
) {
    fun maxSkill(): String {
        val maxSkill = playerSkills.maxCategory()
        return maxSkill
    }

    private fun <Skill, Value : Comparable<Value>> Map<Skill, Value>.maxCategory(): Skill {

        val maxEntries = entries.filter { it.value == values.max() }
        return maxEntries.random().key
    }
}