package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.getText
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ChatPage.inputTextField
import com.atiurin.sampleapp.pages.ChatPage.sendButton
import com.atiurin.sampleapp.pages.ChatPage.sentMessage
import com.atiurin.sampleapp.pages.ChatPage.title
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChatSteps {

    fun assertChatIsOpen(friend: String) {
        Assert.assertEquals(title.getText(), friend)
        Assert.assertTrue(sendButton.isViewDisplayed())
    }
    fun writeMessageForFriend(text: String) {
        inputTextField.typeText(text)
    }
    fun sendMessage() {
        sendButton.tap()
    }
    fun assertMessageHasBeenSent(text: String) {
        Assert.assertTrue(sentMessage(text).isViewDisplayed())
    }
}
