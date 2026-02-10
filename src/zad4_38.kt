fun main() {
    try {
        println("Введите a: ")
        val a = readln().toDouble()
        println("Введите b: ")
        val b = readln().toDouble()
        println("Введите c: ")
        val c = readln().toDouble()
        println("Введите d: ")
        val d = readln().toDouble()
        println("Введите x: ")
        val x = readln().toDouble()

        val message = when {
            x in a..b && x in c..d -> "x принадлежит обоим отрезкам (их общей части)"
            x in a..b -> "x принадлежит только отрезку [a, b]"
            x in c..d -> "x принадлежит только отрезку [c, d]"
            else -> "x не принадлежит ни одному из отрезков"
        }

        println(message)
    } catch (e: Exception) {
        println("Ошибка ввода, введите числа.")
    }
}