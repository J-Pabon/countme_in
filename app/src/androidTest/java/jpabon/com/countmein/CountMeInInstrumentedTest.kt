package jpabon.com.countmein

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.hamcrest.core.AnyOf.anyOf
import org.hamcrest.core.IsNot.not

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
    fun checkSearchEditViewAndButtonAreVisible() {
        onView(withId(R.id.etEventCode)).check(matches(isDisplayed()))
        onView(withId(R.id.btnSearchEvent)).check(matches(isDisplayed()))
    }

    @Test
    fun checkSearchEditViewAndButtonAreVisibleInScroll() {
        onView(withId(R.id.etEventCode)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.btnSearchEvent)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun checkSearchEditViewAndButtonAreEnabled() {
        onView(withId(R.id.etEventCode)).check(matches(isEnabled()))
        onView(withId(R.id.btnSearchEvent)).check(matches(isEnabled()))
    }

    @Test
    fun checkSearchResultMessageIsHide() {
        onView(withId(R.id.tvSearchResultMessage)).check(matches(not(isDisplayed())))
    }

    @Test
    fun userSearchForEventWithCode() {
        val testEventCode = "0123"

        onView(withId(R.id.etEventCode)).perform(typeText(testEventCode), closeSoftKeyboard())
        onView(withId(R.id.btnSearchEvent)).perform(click())

        onView(withId(R.id.tvSearchResultMessage)).check(matches(withText("No events found")))
    }
}
