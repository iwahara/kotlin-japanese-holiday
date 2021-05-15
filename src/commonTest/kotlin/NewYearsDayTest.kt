import com.github.iwahara.japaneseholiday.NewYearsDay
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NewYearsDayTest {

    @Test
    fun test_support_true() {
        val newYearsDay = NewYearsDay()
        for (i in 1950..2020) {
            assertTrue(newYearsDay.support(i, 1, 1))
        }
    }

    @Test
    fun test_support_false() {
        val newYearsDay = NewYearsDay()
        assertFalse(newYearsDay.support(2020, 2, 1));
        assertFalse(newYearsDay.support(2020, 1, 2));
    }
}