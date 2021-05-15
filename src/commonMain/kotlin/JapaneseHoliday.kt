package com.github.iwahara.japaneseholiday

interface JapaneseHoliday {

    fun support(year: Int, month: Int, day: Int): Boolean

    fun toJapaneseString(): String

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int
}