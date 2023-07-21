package lesson1

fun main() {
    val secondsInSpace: Int = 6480
    val time = String.format("ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ %02d:%02d:%02d", secondsInSpace / 3600, secondsInSpace / 60 % 60, secondsInSpace % 60)

    print(time)
}