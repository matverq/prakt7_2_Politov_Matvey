fun main() {
    try {
        println("Введите число a: ")
        var a = readln().toDouble()
        println("Введите число b: ")
        val b = readln().toDouble()
        a = when {
            a <= b -> 0.0
            else -> a
        }

        println("Результат: a = $a, b = $b")
    } catch (e: Exception) {
        println("Ошибка ввода, введите числа.")
    }
}