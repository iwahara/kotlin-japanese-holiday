package com.github.iwahara.japaneseholiday

class NewYearsDay : JapaneseHoliday {
    override fun support(year: Int, month: Int, day: Int): Boolean {
        return month == 1 && day == 1
    }

    override fun toJapaneseString(): String {
        return "元日"
    }

    override fun equals(other: Any?): Boolean {
        if (other is NewYearsDay) {
            return this.toJapaneseString() == other.toJapaneseString()
        }
        return false
    }

    override fun hashCode(): Int {
        return this::class.hashCode()
    }
}