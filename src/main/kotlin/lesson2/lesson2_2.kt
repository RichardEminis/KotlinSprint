package lesson2

fun main() {
    val numberOfEmployees: Int = 50
    val numberOfInterns: Int = 30
    val employeeSalary: Int = 30000
    val InternSalary: Int = 20000

    val finalSalaryOfEmployees: Int = numberOfEmployees * employeeSalary
    val finalSalaryOfInterns: Int = numberOfInterns * InternSalary
    val generalSalary: Int = finalSalaryOfEmployees + finalSalaryOfInterns
    val averageSalary: Int = generalSalary / (numberOfEmployees + numberOfInterns)

    println("Общая зарплата постоянных сотрудников = $finalSalaryOfEmployees")
    println("Общая зарплата всех сотрудников = $generalSalary")
    println("Средняя зарплата = $averageSalary")
}