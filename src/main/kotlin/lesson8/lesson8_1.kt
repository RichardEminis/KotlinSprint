package lesson8

fun main () {
    var sumOfViews: Int = 0
    var weeklyViews: IntArray = intArrayOf(4, 6, 2, 1, 7, 8, 14)

    for (i in weeklyViews) {
        sumOfViews = sumOfViews + i
    }
    println("$sumOfViews")
}