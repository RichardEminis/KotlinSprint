package lesson16

fun main() {
    val order1 = StoreOrder(
        numberOfOrder = 1,
        isReady = false,
        statusOfOrder = false
    )

    println("Введите номер заказа:") //Подразумевается, что пользователь знает номер заказа и отправляет запрос менеджеру
    val userOrder = readln().toInt()

    println("Статуст вашего заказа: ${order1.statusOfOrder}\nХотите изменить статус заказа на 'Готово'? (да/нет)")
    if (readln().equals("да", ignoreCase = true)) {
        order1.statusOfOrder = true
        order1.manage(Pair(order1.statusOfOrder, userOrder))
        println("Статус заказа №$userOrder: ${order1.checkStatus()}")
    } else return
}

class StoreOrder(
    private val numberOfOrder: Int,
    private var isReady: Boolean,
    var statusOfOrder: Boolean
) {
    fun checkStatus(): Boolean {
        return isReady
    }

    private fun changeOrder(newStatus: Boolean) {
        isReady = newStatus
        println("Статус заказа №$numberOfOrder изменен")
    }

    fun manage(newStatus: Pair<Boolean, Int>) {
        println("Здравствуйте 'Менеджер'\nНовый статус для заказа №$numberOfOrder: ${newStatus.first}")

        println("Принять новые изменения? (да/нет)")
        if (readln().equals("да", ignoreCase = true)) {
            changeOrder(newStatus.first)
        } else {
            println("Статус не одобрен.")
            isReady = false
        }
    }
}