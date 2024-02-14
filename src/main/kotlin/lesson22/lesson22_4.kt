package lesson22

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}

data class MainScreenState(val data: String?, val isLoading: Boolean)

class MainScreenViewModel(
    private var mainScreenState: MainScreenState = MainScreenState(data = null, isLoading = false),
    private val listOfState: List<String> = listOf("Данные не загружены", "Данные загружаются", "Данные загружены")
) {

    fun loadData() {
        checkStatus(0)
        Thread.sleep(2000)
        mainScreenState = mainScreenState.copy(isLoading = true)
        checkStatus(1)
        Thread.sleep(2000)
        mainScreenState = mainScreenState.copy(data = "Некие данные", isLoading = false)
        checkStatus(2)
    }

    private fun checkStatus(indexOfState: Int) {
        println("Загружаемые данные: ${mainScreenState.data}")
        println("Статус загрузки: ${mainScreenState.isLoading}")
        println("${listOfState[indexOfState]}\n")
    }
}