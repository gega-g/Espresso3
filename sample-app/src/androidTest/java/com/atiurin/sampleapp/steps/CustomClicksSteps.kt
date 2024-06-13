package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.CustomClicksPage.button
import com.atiurin.sampleapp.pages.CustomClicksPage.circles
import org.junit.Assert

object CustomClicksSteps {
    fun assertCustomClicksOpened() {
        Assert.assertTrue(button().isViewDisplayed())
    }
    fun checkEveryCircle() {
        for (circle in circles) {
            Espresso.onView(circle).perform(ViewActions.click())
        }
    }
    fun assertEveryCircleChecked() {
        for (circle in circles) {
            Espresso.onView(circle).check(ViewAssertions.matches(ViewMatchers.isChecked()))
        }
    }
}
