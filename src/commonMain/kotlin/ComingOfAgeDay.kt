package com.github.iwahara.japaneseholiday

class ComingOfAgeDay : JapaneseHoliday {
    override fun support(year: Int, month: Int, day: Int): Boolean {
        return Triple(year, month, day) == Triple(2021, 1, 11)
    }

    override fun toJapaneseString(): String {
        return "成人の日"
    }

    override fun equals(other: Any?): Boolean {
        if (other is ComingOfAgeDay) {
            return this.toJapaneseString() == other.toJapaneseString()
        }
        return false
    }

    override fun hashCode(): Int {
        return this::class.hashCode()
    }
}