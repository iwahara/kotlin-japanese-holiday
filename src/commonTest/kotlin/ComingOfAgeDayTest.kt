import com.github.iwahara.japaneseholiday.ComingOfAgeDay
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ComingOfAgeDayTest {

    @Test
    fun test_support_true() {
        val holiday = ComingOfAgeDay()
        assertTrue(holiday.support(2021, 1, 11))
    }

    @Test
    fun test_support_false() {
        val holiday = ComingOfAgeDay()
        assertFalse(holiday.support(2020, 1, 11))
    }
}