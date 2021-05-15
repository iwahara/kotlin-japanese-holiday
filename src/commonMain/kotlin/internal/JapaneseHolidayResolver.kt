package com.github.iwahara.japaneseholiday.internal

import com.github.iwahara.japaneseholiday.JapaneseHoliday
import com.github.iwahara.japaneseholiday.WeekDay

class JapaneseHolidayResolver(private val holidayList: List<JapaneseHoliday>) {

    fun support(year: Int, month: Int, day: Int): JapaneseHoliday {
        holidayList.forEach {
            if (it.support(year = year, month = month, day = day)) {
                return it
            }
        }
        return WeekDay()
    }
}