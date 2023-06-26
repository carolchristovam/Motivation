package com.example.motivation

import com.example.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val mListPhrase = listOf<Phrase>(
        Phrase("", sunny)
        // colocar lista de frases do github
    )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].description

    }
}