package lesson4

fun main() {
    var dayOfTraining: Int = 6
    val isEven: Boolean = dayOfTraining % 2 == 0
    var armTraining: Boolean = isEven
    var pressTraining: Boolean = isEven
    var legsTraining: Boolean = !isEven
    var backTraining: Boolean = !isEven
    var pectoralTraining: Boolean = isEven
    var shouldersTraining: Boolean = isEven

    println(
        """
    Упражнения для рук:    $armTraining
    Упражнения для ног:    $legsTraining
    Упражнения для спины:  $backTraining
    Упражнения для пресса: $pressTraining
    """
    )
}