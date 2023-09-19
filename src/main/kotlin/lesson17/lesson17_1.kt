package lesson17

class Quiz {
    var question: String = "Кто проживает на дне океана?"
        set(value: String) {
            field = value
        }
    var answer: String = "SpongeBob SquarePants"
        get() = field
        set(value: String) {
            field = value
        }
}