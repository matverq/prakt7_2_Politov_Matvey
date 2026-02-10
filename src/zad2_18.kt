fun main() {
    try {
        println("Введите размеры отверстия A:")
        val a = readln().toDouble()
        println("Введите размеры отверстия B:")
        val b = readln().toDouble()

        println("Введите размеры кирпича x:")
        val x = readln().toDouble()
        println("Введите размеры кирпича y:")
        val y = readln().toDouble()
        println("Введите размеры кирпича z:")
        val z = readln().toDouble()
        val fits = when {
            (x <= a && y <= b) || (y <= a && x <= b) -> true
            (x <= a && z <= b) || (z <= a && x <= b) -> true
            (y <= a && z <= b) || (z <= a && y <= b) -> true
            else -> false
        }

        if (fits) {
            println("кирпич проходит")
        } else {
            println("кирпич не проходит")
        }
    } catch (e: Exception) {
        println("Ошибка ввода, введите числа.")
    }
}