package lesson18

fun main() {
    val singleOrder: Order = SingleOrder(
        numberOfOrder = 4,
        item = "Капуста"
    )

    val multipleOrder: Order = MultipleOrder(
        numberOfOrder = 4,
        listOfItems = listOf("Морковь, Помидоры, Огурцы, Петрушка")
    )

    val list = arrayOf<Order>(singleOrder, multipleOrder)

    showAllOrders(list)
}

open class Order(
    val numberOfOrder: Int,
) {
    open fun printOrders() {}
}


class SingleOrder(
    numberOfOrder: Int,
    val item: String
) : Order(numberOfOrder) {
    override fun printOrders() {
        println("Заказан товар: $item")
    }
}

class MultipleOrder(
    numberOfOrder: Int,
    val listOfItems: List<String>
) : Order(numberOfOrder) {
    override fun printOrders() {
        println("Заказаны следующие товары: $listOfItems")
    }
}

fun showAllOrders(orders: Array<Order>) {
    orders.forEach {
        println(it.printOrders())
    }
}