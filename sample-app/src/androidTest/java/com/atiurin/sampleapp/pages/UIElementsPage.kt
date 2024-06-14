package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UIElementsPage {
    val simpleButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.button1) }
    val clickCount: Matcher<View> by lazy { ViewMatchers.withId(R.id.last_event_status) }
    val enableButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_enable) }
    val clickableButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_clickable) }
    val invisibleButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.radio_invisible) }
}
