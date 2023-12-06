package lesson21

import java.io.File

fun main() {

    val words = File("Words.txt")
    words.writeText("")
    for (i in 0..5) {
        println("Введите текст для записи:")
        words.writeToFile()
    }
}

fun File.writeToFile(): File {
    val savedFile = this.readText()
    this.writeText("${readln().lowercase()}\n")
    this.appendText(savedFile)
    return this
}