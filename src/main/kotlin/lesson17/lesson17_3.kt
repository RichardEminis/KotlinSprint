package lesson17

fun main() {
    val folder = Folder()

    println(folder.name)
    println(folder.numberOfFiles)

    folder.secretTag = true

    println(folder.name)
    println(folder.numberOfFiles)
}

class Folder(
    var secretTag: Boolean = false
) {
    val name: String = "Музыка"
        get() = if (secretTag == false) "Ошибка доступа" else field

    val numberOfFiles: Int = 5
        get() = if (secretTag == false) 0 else field
}