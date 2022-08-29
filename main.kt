import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)

    var number_emp: Int // количество сотрудников
    var hours: Double // отработанные часы
    var rate: Double // часовая ставка в руб.
    var count_emp: Int = 0 // переменная цикла
    var pay: Double // зарплата текущего сотрудника в руб.
    var total_pay: Double = 0.0 // общая зарплата компании

    println("Введите количетсво сотрудников: ")
    number_emp = scan.nextLine().trim().toInt()
    while (count_emp < number_emp){
        println("Введите отработанное время для сотрудника : $count_emp")
        hours = scan.nextLine().trim().toDouble()
        println("Введите часовую ставку для для сотрудника : $count_emp")
        rate = scan.nextLine().trim().toDouble()
        pay = hours * rate
        println("Сотрудник $count_emp должен получить $pay рублей")
        total_pay += pay
        count_emp++
    }
    println("Общая зарплата компании за данный период: $total_pay")

}
