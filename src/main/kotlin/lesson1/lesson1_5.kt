package lesson1

fun main() {
    var secondsInSpace: Int = 6480
    val hoursInSpace: Int = (secondsInSpace / 60) / 60
    val minutesInSpace: Int = (secondsInSpace/60) - (60*hoursInSpace)
    var seconds: Int = minutesInSpace*60 - (secondsInSpace - 3600*hoursInSpace)
    seconds = Math.abs(seconds)
    val second: Int

    if(seconds < 10) {
        seconds.toString()
        println("ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ $hoursInSpace:$minutesInSpace:0$seconds")
    } else {
        second = seconds
        println("ГАГАРИН НАХОДИЛСЯ В КОСМОСЕ $hoursInSpace:$minutesInSpace:$second")
    }




}