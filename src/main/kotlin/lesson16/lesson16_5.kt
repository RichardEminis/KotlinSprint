package lesson16

const val POWER_OF_HEALING_POTION = 20
const val CUCUMBER_OF_POWER = 100
fun main() {
    val player1 = Player(
        name = "Борис"
    )

    val player2 = Player(
        name = "Семен"
    )

    player1.punch(player2)
    player2.punch(player1)
    player2.punch(player1)
    player1.healingPotion()
    player1.punch(player2)
    player2.healingPotion()
}

class Player(
    val name: String,
    private var health: Int = 100,
    private var damage: Int = 20,
    private var isDead: Boolean = false
) {
    private fun death() {
        health = 0
        damage = 0
        isDead = true
    }

    fun takeDamage(inputDamage: Int) {
        if (isDead) return
        health -= inputDamage
        println("Игроку $name нанесено урона: $inputDamage")
        if (health <= 0) death()
        statusOfHealth()
    }

    fun healingPotion() {
        if (isDead) {
            println("Вы пытаетесь засунуть лечебный огурец игроку в рот,")
            println("но $name мертв... сейчас ему ничего не поможет...")
            return
        }
        health += POWER_OF_HEALING_POTION
        damage = CUCUMBER_OF_POWER
        println("$name, съедает лечебный огурец и впадает в огуречную ярость!!!")
        statusOfHealth()
    }

    fun punch(player: Player): Int {
        val listOfPunch = listOf("нос", "глаз", "голову", "живот", "ногу", "руку", "зубы")
        println("$name произвел удар в ${listOfPunch.random()}")
        player.takeDamage(damage)
        return damage
    }

    fun statusOfHealth() {
        if (isDead) {
            println("$name мертв...\n")
            return
        }
        println("${name}, ваш статус здоровья сейчас = $health\n")
    }
}