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

    fun assertChatIsOpen(friend: String): ChatSteps {
        Assert.assertEquals(title.getText(), friend)
        Assert.assertTrue(sendButton.isViewDisplayed())
        return this
    }
    fun writeMessageForFriend(text: String): ChatSteps {
        inputTextField.typeText(text)
        return this
    }
    fun sendMessage(): ChatSteps {
        sendButton.tap()
        return this
    }
    fun assertMessageHasBeenSent(text: String) {
        Assert.assertTrue(sentMessage(text).isViewDisplayed())
    }
}
