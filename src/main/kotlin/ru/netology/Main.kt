package ru.netology

fun main() {
    println("Был(а) ${howMuchAgo(666)}")
}

fun howMuchAgo(seconds: Int = 0): String {
    val minute = 60
    val hour = minute * 60
    val day = hour * 24
    val today = day * 2
    val yesturday = today + day

    return when {
        (seconds <= minute) -> "только что"
        (seconds <= hour) -> "${seconds / minute} ${wordMinuteCase(seconds / minute)} назад"
        (seconds <= day) -> "${seconds / hour} ${wordHourCase(seconds / hour)} назад"
        (seconds <= today) -> "сегодня>"
        (seconds <= yesturday) -> "вчера>"
        else -> "давно"
    }
}


