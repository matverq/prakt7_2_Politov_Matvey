fun main() {
    try {
        println("Введите коэффициент a: ")
        val a = readln().toDouble()
        println("Введите коэффициент b: ")
        val b = readln().toDouble()
        println("Введите коэффициент c: ")
        val c = readln().toDouble()
        println("Введите коэффициент d: ")
        val d = readln().toDouble()
        println("Введите коэффициент e: ")
        val e = readln().toDouble()
        println("Введите коэффициент f: ")
        val f = readln().toDouble()

        val delt = a * e - b * d
        val deltX = c * e - b * f
        val deltY = a * f - c * d

        when {
            delt != 0.0 -> {
                val x = deltX / delt
                val y = deltY / delt
                println("\nРешение системы: x  = %.2f y = %.2f".format(x, y ))
            }
            deltX == 0.0 && deltY == 0.0 -> {
                println("Система имеет бесконечно много решений.")
            }
            else -> {
                println("Система не имеет решений.")
            }
        }
    } catch (e: Exception) {
        println("Ошибка ввода, введите числа.")
    }
}