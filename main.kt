import java.util.*
import kotlin.system.exitProcess

fun main(){
    val input = Scanner(System.`in`) //Подтянули сканер

    // Указываем курс доллара (в будущем нужно автоматизовать этот процесс)
    print("Enter the dollar rate: ")
    val ROUBLES_PER_DOLLAR: Double = input.nextDouble()

    print("Enter dollar amount: ")
    val dollars: Double = input.nextDouble()    // Получаем сумму в долларах
    var digit: Int
    val roubles: Double = dollars * ROUBLES_PER_DOLLAR     //Конвертируем сумму денег в российские рубли

    //Отображаем сумму с правильным окончанием
    println(roubles)

}
