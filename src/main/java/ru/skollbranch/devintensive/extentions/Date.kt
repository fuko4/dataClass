package ru.skollbranch.devintensive.extentions

import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter
import java.util.regex.Pattern  

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"):String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

//fun Date.add(value: Int, units: String): Date{
//    var time = this.time
//
//}

