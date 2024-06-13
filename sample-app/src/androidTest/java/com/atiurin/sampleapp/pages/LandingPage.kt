package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object LandingPage {
    val toolbar: Matcher<View> by lazy { withId(R.id.toolbar) }
    fun name(text: String): Matcher<View> {
        return Matchers.allOf(
            withId(R.id.tv_name),
            withText(text)
        )
    }
    val customClicksButton: Matcher<View> by lazy { withId(R.id.custom_clicks_nav_item) }
}
