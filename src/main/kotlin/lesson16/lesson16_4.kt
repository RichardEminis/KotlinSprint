package lesson16

fun main() {
    val order1 = StoreOrder(
        numberOfOrder = 1,
        isReady = false
    )

    println("Введите номер заказа:") //Подразумевается, что пользователь знает номер заказа и отправляет запрос менеджеру
    val userOrder = readln().toInt()

    println("Статуст вашего заказа: ${order1.checkStatus()}\nХотите изменить статус заказа на 'Готово'? (да/нет)")
    var newUserStatus = false
    if (readln() == "да") {
        newUserStatus = true
    } else return

    order1.manager(order1.changeOrder(newUserStatus, userOrder))

    println("Статус заказа №$userOrder: ${order1.checkStatus()}")
}

class StoreOrder(
    private val numberOfOrder: Int,
    protected var isReady: Boolean
) {
    fun checkStatus(): Boolean {
        return isReady
    }

    fun changeOrder(newStatus: Boolean, numberOfOrder: Int): Pair<Boolean, Int> {
        isReady = newStatus

        return Pair(newStatus, numberOfOrder)
    }

    fun manager(newStatus: Pair<Boolean, Int>) {
        println("Здравствуйте 'Менеджер'\nНовый статус для заказа №$numberOfOrder: ${newStatus.first}")

        println("Принять новые изменения? (да/нет)")
        if (readln() == "да") {
            println("Статус заказа №$numberOfOrder изменен")
        } else {
            println("Статус не одобрен.")
            isReady = false
        }
    }
}