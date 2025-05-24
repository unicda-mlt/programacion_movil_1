import java.util.Calendar

fun main () {
    dayOfWeek()
}

fun dayOfWeek(): Unit {
    println("What day is it today?")

    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (dayOfWeek) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}