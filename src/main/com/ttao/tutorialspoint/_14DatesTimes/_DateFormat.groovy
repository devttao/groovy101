package main.com.ttao.tutorialspoint._14DatesTimes

import java.text.SimpleDateFormat
import java.time.LocalDate

class _DateFormat {
    static void main(String[] args) {
        def pattern = "yyyy-MM-dd"
        def input = "2020-01-10"

        def date = new SimpleDateFormat(pattern).parse(input)

        def date2 = Date.parse(pattern, input)

        def date3 = LocalDate.parse(input, pattern)

        println(date)
        println(date2)
        println(date3)

        def date4 = new Date().parse("dd.MM.yyy", '18.05.1988')
        println date4 // Wed May 18 00:00:00 EEST 1988

        def extendedDate = new Date().parse("dd.MM.yyy HH:mm:ss", '18.05.1988 12:15:00')
        println extendedDate // Wed May 18 12:15:00 EEST 1988

    }
}
