package lesson4

fun main() {
    var dayOfTraining: Int = 6
    var armTraining: Boolean = true
    var pressTraining: Boolean = true
    var legsTraining: Boolean = false
    var backTraining: Boolean = false

    if (dayOfTraining % 2 != 0) {
        armTraining = !armTraining
        pressTraining = !pressTraining
        legsTraining = !legsTraining
        backTraining = !backTraining
        println(
            """
    Упражнения для рук:    $armTraining
    Упражнения для ног:    $legsTraining
    Упражнения для спины:  $backTraining
    Упражнения для пресса: $pressTraining"""
        )
    } else {
        println(
            """
    Упражнения для рук:    $armTraining
    Упражнения для ног:    $legsTraining
    Упражнения для спины:  $backTraining
    Упражнения для пресса: $pressTraining"""
        )
    }


}