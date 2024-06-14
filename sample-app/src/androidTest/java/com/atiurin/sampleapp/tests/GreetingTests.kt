package com.atiurin.sampleapp.tests
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Constants.MESSAGE
import com.atiurin.sampleapp.data.Constants.PHOEBEBUFFAY
import com.atiurin.sampleapp.steps.ChatSteps
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.LandingPageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class GreetingTests {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun chatWithFriend() {
        with(LandingPageSteps) {
            assertDashboardIsLoaded()
            openChatWithFriend(PHOEBEBUFFAY)
        }
        with(ChatSteps) {
            assertChatIsOpen(PHOEBEBUFFAY)
            writeMessageForFriend(MESSAGE)
            sendMessage()
            assertMessageHasBeenSent(MESSAGE)
        }
    }

    @Test
    fun customClicksTest() {
        with(LandingPageSteps) {
//            clickOnToolbar(110, 250)
            navigateToCustomClicks()
        }
        with(CustomClicksSteps) {
            assertCustomClicksOpened()
            checkEveryCircle()
            assertEveryCircleChecked()
        }
    }
}
