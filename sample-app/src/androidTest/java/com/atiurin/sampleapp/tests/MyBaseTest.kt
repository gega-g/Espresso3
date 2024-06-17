package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.ChatSteps
import com.atiurin.sampleapp.steps.LandingPageSteps
import org.junit.Rule

abstract class MyBaseTest {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    fun chatTests(name: String, message: String) {
        LandingPageSteps
            .scrollToFriendChat(name)
            .openChatWithFriend(name)

        ChatSteps
            .assertChatIsOpen(name)
            .writeMessageForFriend(message)
            .sendMessage()
            .assertMessageHasBeenSent(message)
    }
}
