fun main() {
    try {
        println("Введите номер дня недели (1-7): ")
        val day = readln().toInt()

        val message = when (day)
        {
            in 1..5 -> "Это рабочий день"
            6, 7 -> "Это выходной день"
            else -> "Ошибка, дня с таким номером не существует. Введите число от 1 до 7."
        }

        println(message)
    } catch (e: Exception) {
        println("Ошибка ввода, введите числа.")
    }
}