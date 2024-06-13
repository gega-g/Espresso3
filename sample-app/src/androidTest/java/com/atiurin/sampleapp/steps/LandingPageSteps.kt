package com.atiurin.sampleapp.steps

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.LandingPage.customClicksButton
import com.atiurin.sampleapp.pages.LandingPage.name
import com.atiurin.sampleapp.pages.LandingPage.toolbar
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object LandingPageSteps {
    fun assertDashboardIsLoaded() {
        Assert.assertTrue(toolbar.isViewDisplayed())
    }

    fun openChatWithFriend(name: String) {
        name(name).tap()
    }

    fun clickOnToolbar(x: Int, y: Int) {
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        uiDevice.click(x, y)
    }

    fun navigateToCustomClicks() {
        customClicksButton.tap()
    }
}
