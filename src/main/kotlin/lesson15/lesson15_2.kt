package lesson15

import kotlin.system.measureNanoTime

fun main() {

    val temperatureData = Temperature(
        temperature = 43
    )

    val precipitationData = Precipitation(
        precipitation = 80
    )

    temperatureData.connectToServer()
    precipitationData.connectToServer()

    temperatureData.sendMessage()
    precipitationData.sendMessage()
}

abstract class MessageSender(
) {
    open fun connectToServer() {
        println("Происходит подключение к серверу...")
        println("Подключение прошло успешно!")
    }

    open fun sendMessage() {
        println()
    }
}

class Temperature(
    val temperature: Int
) : MessageSender() {
    override fun sendMessage() {
        println("Температура = $temperature")
    }
}

class Precipitation(
    val precipitation: Int
) : MessageSender() {
    override fun sendMessage() {
        println("Процент осадков = $precipitation")
    }
}