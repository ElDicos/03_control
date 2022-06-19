package ru.netology

fun wordMinuteCase(num: Int): String {
    val number = num
    val lastNumberEleven = number % 100
    val amountLastNumber = number % 10

    return when {
        (lastNumberEleven === 11) -> "минут"
        (amountLastNumber === 1) -> "минуту"
        (number > 1 && number < 5) -> "минуты"
        else -> "минут"
    }
}

fun wordHourCase(num: Int): String {
    val number = num
    val lastNumberEleven = number % 100
    val amountLastNumber = number % 10

    return when {
        (lastNumberEleven === 11) -> "часов"
        (amountLastNumber === 1) -> "час"
        (number > 1 && number < 5) -> "часа"
        else -> "часов"
    }
}