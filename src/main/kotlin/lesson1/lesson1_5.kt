package lesson1

fun main() {
    var secondsInSpace: Int = 6480
    val hoursInSpace: Int = (secondsInSpace / 60) / 60
    val minutesInSpace: Int = (secondsInSpace/60) - (60*hoursInSpace)
    var seconds: Int = minutesInSpace*60 - (secondsInSpace - 3600*hoursInSpace)
    seconds = Math.abs(seconds)

    if((seconds < 10)&&(hoursInSpace < 10)) {
        println("ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ 0$hoursInSpace:$minutesInSpace:0$seconds")
    } else if ((seconds < 10)&&(hoursInSpace >= 10)){
        println("ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ $hoursInSpace:$minutesInSpace:0$seconds")
    } else {
        println("ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ $hoursInSpace:$minutesInSpace:$seconds")
    }
}