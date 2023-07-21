package lesson1

fun main() {
    var secondsInSpace: Int = 6480
    var time = String.format(
        "ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ %02d:%02d:%02d",
        secondsInSpace / 3600,
        secondsInSpace / 60 % 60,
        secondsInSpace % 60
    )
//крутая штука, я заценил :D
    print(time)
}