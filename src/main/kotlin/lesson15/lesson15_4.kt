package lesson15

fun main() {

    val instrument = Instrument(
        name = "Гитара",
        amount = 4,
        listOfAccessories = listOf(
            Accessories("Ремень", 2),
            Accessories("Медиатор", 43),
            Accessories("Тюнер", 10)
        )
    )

    instrument.findAccessories()

}

abstract class Product(
    val name: String,
    val amount: Int
) : Find

class Instrument(
    name: String,
    amount: Int,
    val listOfAccessories: List<Accessories>

) : Product(name, amount) {
    override fun findAccessories() {
        println("Список аксессуаров для $name: ")
        super.findAccessories()
        for (i in listOfAccessories) {
            println("Товар: ${i.name}, Количество: ${i.amount}")
        }
    }
}

class Accessories(
    name: String,
    amount: Int
) : Product(name, amount)

interface Find {
    fun findAccessories() {
        println("Выполняется поиск...")
    }
}