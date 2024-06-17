package com.atiurin.sampleapp.tests

import com.atiurin.sampleapp.data.FriendsData.emmetBrownData
import com.atiurin.sampleapp.data.FriendsData.friend17Data
import com.atiurin.sampleapp.data.FriendsData.friend25Data
import org.junit.Test

class WeekendVibeTests : MyBaseTest() {

    @Test
    fun emmetBrownTest() {
        for ((name, message) in emmetBrownData()) {
            chatTests(name, message)
        }
    }

    @Test
    fun friend17Test() {
        for ((name, message) in friend17Data()) {
            chatTests(name, message)
        }
    }

    //    this test will fail on purpose
    @Test
    fun friend25Test() {
        for ((name, message) in friend25Data()) {
            chatTests(name, message)
        }
    }
}
