package lesson7

fun main (){
    var smsNumbers: String = (1..9).random().toString()

    do{
        for (i in 2 downTo 0 ){
            var storageSmsNumbers:String = smsNumbers
            smsNumbers = (1..9).random().toString()
            smsNumbers += storageSmsNumbers
        }
        println("Ваш код авторизации: $smsNumbers")

        println("Введите код из SMS")
        var userAnswer: String = readln()
        if (userAnswer == smsNumbers) {
            print("Поздравляю! Код введен верно!")
        } else {
            smsNumbers = (1..9).random().toString()
            println("Код введен неверно, попробуйте снова.")
            println()
        }
    } while (smsNumbers != userAnswer)
}
