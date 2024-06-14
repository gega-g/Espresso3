package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.steps.UIElementsSteps
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UIElementsTests : BaseTest() {

    @Test
    fun buttonsTest() {
        with(UIElementsSteps) {
            unMarkEnableButton()
            unMarkClickableButton()
            validateNotEnabled()
            validateNotClickable()
        }
    }

    @Test
    fun clicksTest() {
        with(UIElementsSteps) {
            clickButton8Times()
            validateClicksCount()
        }
    }
}
