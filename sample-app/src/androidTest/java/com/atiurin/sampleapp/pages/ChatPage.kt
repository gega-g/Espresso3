package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChatPage {
    val title: Matcher<View> by lazy { ViewMatchers.withId(R.id.toolbar_title) }
    val inputTextField: Matcher<View> by lazy { ViewMatchers.withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.send_button) }
    fun sentMessage(text: String): Matcher<View> {
        return Matchers.allOf(
            ViewMatchers.withId(R.id.message_text),
            ViewMatchers.withText(text)
        )
    }
}
