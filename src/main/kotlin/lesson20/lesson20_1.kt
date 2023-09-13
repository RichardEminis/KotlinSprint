package lesson20

fun main() {
    val name = "Яромир"

    val printStringWithLambda: (String) -> Unit
    println({ it: String -> "С наступающим Новым Годом, $it!" }(name))
}