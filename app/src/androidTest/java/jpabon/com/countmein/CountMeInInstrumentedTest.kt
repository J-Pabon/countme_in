package jpabon.com.countmein

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4ClassRunner::class)
class CountMeInInstrumentedTest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule(CountMeInActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("jpabon.com.countmein", appContext.packageName)
    }

    @Test
    fun userSearchForEventWithCode() {
        val testEventCode = "0123"

        onView(withId(R.id.etEventCode)).perform(typeText(testEventCode), closeSoftKeyboard())
    }
}
