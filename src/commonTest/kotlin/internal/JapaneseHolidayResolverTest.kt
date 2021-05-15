package com.github.iwahara.japaneseholiday.internal

import com.github.iwahara.japaneseholiday.WeekDay
import kotlin.test.Test
import kotlin.test.assertEquals

class JapaneseHolidayResolverTest {
    @Test
    fun test_support_何も設定しなければ常に平日() {
        val resolver = JapaneseHolidayResolver(listOf())
        val actual = resolver.support(2020, 1, 1)
        assertEquals(WeekDay(), actual)
    }
}