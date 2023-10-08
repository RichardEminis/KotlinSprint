package lesson19

fun main() {
    val ironTank = Tank(
        name = "Железяка",
        typeOfAmmo = Ammo.NOTHING
    )
    ironTank.equipDemo(Ammo.GREEN)
    ironTank.fire()

    ironTank.equipDemo(Ammo.BLUE)
    ironTank.fire()

    ironTank.equipDemo(Ammo.RED)
    ironTank.fire()
}

enum class Ammo(val color: String, val dmg: Int) {
    NOTHING("Ничем не заряжен", 0),
    BLUE("Синие", 5),
    GREEN("Зеленые", 10),
    RED("Красные", 15)
}

class Tank(
    val name: String,
    var typeOfAmmo: Ammo
) {
    fun equipDemo(ammunition: Ammo) {
        this.typeOfAmmo = ammunition
        println("Вооружены следующие патроны: ${ammunition.color}")
    }

    fun fire() {
        println("ПРОИЗВЕДЕН ВЫСТРЕЛ!")
        println("____________|]------iiiiiiiD -----iiiiiiiD -----iiiiiiiD") //Это типа пули летят из пушки:D
        println("Нанесен урон: ${typeOfAmmo.dmg}")
        println()
    }
}