package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.LandingPageSteps
import com.atiurin.sampleapp.steps.UIElementsSteps
import com.atiurin.sampleapp.steps.UIElementsSteps.validateInvisible
import org.junit.After
import org.junit.Before
import org.junit.Rule
abstract class BaseTest {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        LandingPageSteps
            .assertDashboardIsLoaded()
            .openBurgerMenu()
            .navigateToUIElements()
    }
    @After
    fun ending(){
        UIElementsSteps
            .makeButtonInvisible()
            .validateInvisible()
    }
}