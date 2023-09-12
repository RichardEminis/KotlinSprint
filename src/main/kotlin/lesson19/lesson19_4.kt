package lesson19

fun main() {
    val ironTank = Tank(
        name = "Железяка",
    )
    ironTank.equip(Ammo.GREEN)
    ironTank.fire()

    ironTank.equip(Ammo.BLUE)
    ironTank.fire()

    ironTank.equip(Ammo.RED)
    ironTank.fire()

}

enum class Ammo(val ammo: String, val dmg: Int) {
    NOTHING("Ничем не заряжен", 0),
    BLUE("Синие", 5),
    GREEN("Зеленые", 10),
    RED("Красные", 15)
}

class Tank(
    val name: String,
    var ammo: String = Ammo.NOTHING.ammo,
    var dmg: Int = Ammo.NOTHING.dmg
) {
    fun equip(getAmmo: Ammo) {
        when (getAmmo) {
            Ammo.NOTHING -> {
                ammo = Ammo.NOTHING.ammo
                dmg = Ammo.NOTHING.dmg
                println("Вооружены следующие патроны: ${ammo}")
            }

            Ammo.BLUE -> {
                ammo = Ammo.BLUE.ammo
                dmg = Ammo.BLUE.dmg
                println("Вооружены следующие патроны: ${ammo}")
            }

            Ammo.GREEN -> {
                ammo = Ammo.GREEN.ammo
                dmg = Ammo.GREEN.dmg
                println("Вооружены следующие патроны: ${ammo}")
            }

            Ammo.RED -> {
                ammo = Ammo.RED.ammo
                dmg = Ammo.RED.dmg
                println("Вооружены следующие патроны: ${ammo}")
            }
        }

    }

    fun fire() {
        println("ПРОИЗВЕДЕН ВЫСТРЕЛ!")
        println("____________|]------iiiiiiiD -----iiiiiiiD -----iiiiiiiD") //Это типа пули летят из пушки:D
        println("Нанесен урон: ${dmg}")
        println()
    }
}