package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.data.Constants.EIGHTCLICKS
import com.atiurin.sampleapp.helper.getText
import com.atiurin.sampleapp.pages.UIElementsPage.clickCount
import com.atiurin.sampleapp.pages.UIElementsPage.clickableButton
import com.atiurin.sampleapp.pages.UIElementsPage.enableButton
import com.atiurin.sampleapp.pages.UIElementsPage.invisibleButton
import com.atiurin.sampleapp.pages.UIElementsPage.simpleButton
import com.atiurin.ultron.extensions.isNotClickable
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotEnabled
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object UIElementsSteps {
    fun unMarkEnableButton() {
        enableButton.tap()
    }
    fun unMarkClickableButton() {
        clickableButton.tap()
    }
    fun makeButtonInvisible(): UIElementsSteps {
        invisibleButton.tap()
        return this
    }
    fun validateNotEnabled() {
        simpleButton.isNotEnabled()
    }
    fun validateNotClickable() {
        simpleButton.isNotClickable()
    }
    fun validateInvisible() {
        simpleButton.isNotDisplayed()
    }
    fun clickButton8Times() {
        repeat(8) {
            simpleButton.tap()
        }
    }
    fun validateClicksCount() {
        Assert.assertEquals(clickCount.getText(), EIGHTCLICKS)
    }
}
