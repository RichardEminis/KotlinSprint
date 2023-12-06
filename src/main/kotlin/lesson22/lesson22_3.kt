package lesson22

fun main(){
    val data = TestData("One", "Two", "Three")
    val (firstData, secondData, thirdData) = data

    println("$firstData, $secondData, $thirdData")
}

data class TestData(
    var firstData: String,
    val secondData: String,
    val thirdData: String
)