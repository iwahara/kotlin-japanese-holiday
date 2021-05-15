package com.github.iwahara.japaneseholiday

class WeekDay : JapaneseHoliday {
    override fun support(year: Int, month: Int, day: Int): Boolean {
        return true
    }

    override fun toJapaneseString(): String {
        return "平日"
    }

    override fun equals(other: Any?): Boolean {
        if (other is WeekDay) {
            return this.toJapaneseString() == other.toJapaneseString()
        }
        return false
    }
}