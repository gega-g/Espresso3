package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.data.Constants.ERRORMESSAGE
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.LandingPage.UIElementsButton
import com.atiurin.sampleapp.pages.LandingPage.burgerMenu
import com.atiurin.sampleapp.pages.LandingPage.customClicksButton
import com.atiurin.sampleapp.pages.LandingPage.name
import com.atiurin.sampleapp.pages.LandingPage.toolbar
import com.atiurin.sampleapp.util.CustomSwiper
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object LandingPageSteps {
    private val customSwiper = CustomSwiper()
    fun assertDashboardIsLoaded(): LandingPageSteps {
        Assert.assertTrue(toolbar.isViewDisplayed())
        return this
    }

    fun openChatWithFriend(name: String) {
        name(name).tap()
    }

    fun navigateToCustomClicks() {
        customClicksButton.tap()
    }

    fun openBurgerMenu(): LandingPageSteps {
        burgerMenu.tap()
        return this
    }
    fun navigateToUIElements(): LandingPageSteps {
        UIElementsButton.tap()
        return this
    }

    fun scrollToFriendChat(name: String): LandingPageSteps {
        var i = 1
        while (!name(name).isViewDisplayed() && i <= 10) {
            customSwiper.searchForFriend()
            i++
            if (i == 10 && !name(name).isViewDisplayed()) {
                throw NoSuchElementException(ERRORMESSAGE)
            }
        }
        return this
    }
}
