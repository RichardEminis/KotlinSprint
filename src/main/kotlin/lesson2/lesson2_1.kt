package lesson2

fun main (){
    average(a = 3, b = 4, c = 3, d = 5)
}

fun average(a: Int, b: Int, c: Int, d: Int ){
    print ("Среднее число = ${(a+b+c+d)/4.0}")
}