package com.atiurin.sampleapp.data

import com.atiurin.sampleapp.data.Constants.EMMETBROWN
import com.atiurin.sampleapp.data.Constants.EMMETBROWNMESSAGE
import com.atiurin.sampleapp.data.Constants.FRIEND17
import com.atiurin.sampleapp.data.Constants.FRIEND17MESSAGE
import com.atiurin.sampleapp.data.Constants.FRIEND25
import com.atiurin.sampleapp.data.Constants.FRIEND25MESSAGE

object FriendsData {
    fun emmetBrownData(): List<Pair<String, String>> {
        return listOf(EMMETBROWN to EMMETBROWNMESSAGE)
    }
    fun friend17Data(): List<Pair<String, String>> {
        return listOf(FRIEND17 to FRIEND17MESSAGE)
    }
    fun friend25Data(): List<Pair<String, String>> {
        return listOf(FRIEND25 to FRIEND25MESSAGE)
    }
}
