package lesson20

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier { phrase -> phrase.split(" ").reversed().joinToString(" ") }
    robot.say()
}

class Robot(
    private var modifier: ((String) -> String) = { it },
    private var savedPhrase: String? = null,
    private val listOfPhrases: List<String> = listOf(
        "В мире есть 10 категорий людей – те, кто знают про двоичное счисление и те кто нет",
        "Чтобы понять рекурсию нужно сначала понять рекурсию",
        "Чтобы отыскать баг, ты должен мыслить, как баг!",
        "Первые 90% проекта занимают 90% времени. Оставшиеся 10% — другие 90%",
        "Как-то одного программиста спросили, а потом горько пожалели об этом…"
    )
) {
    fun say() {
        val phrase = savedPhrase ?: listOfPhrases.random()
        println(modifier(phrase))
        savedPhrase = phrase
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}