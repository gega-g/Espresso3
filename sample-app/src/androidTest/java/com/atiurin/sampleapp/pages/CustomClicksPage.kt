package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.Constants.BUTTON
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object CustomClicksPage {
    fun button(): Matcher<View> {
        return Matchers.allOf(
            ViewMatchers.withId(R.id.button),
            ViewMatchers.withText(BUTTON)
        )
    }
    val circles = listOf(
        ViewMatchers.withId(R.id.rB_top_left),
        ViewMatchers.withId(R.id.rB_center_left),
        ViewMatchers.withId(R.id.rB_bottom_left),
        ViewMatchers.withId(R.id.rB_top_right),
        ViewMatchers.withId(R.id.rB_center_right),
        ViewMatchers.withId(R.id.rB_bottom_right),
        ViewMatchers.withId(R.id.rB_top_center),
        ViewMatchers.withId(R.id.rB_bottom_center)
    )
}
