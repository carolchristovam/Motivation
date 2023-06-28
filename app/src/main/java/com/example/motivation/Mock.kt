package com.example.motivation

import com.example.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val mListPhrase = listOf<Phrase>(
        Phrase(
            "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle",
            sunny
        ),
        Phrase(
            "The only limit to your success is the belief that you cannot achieve it. Dream big, work hard, and make it happen",
            sunny
        ),
        Phrase(
            "Success is not final, failure is not fatal: It is the courage to continue that counts",
            sunny
        ),
        Phrase(
            "Challenges are what make life interesting. Overcoming them is what makes life meaningful",
            sunny
        ),
        Phrase("Don't wait for the perfect moment. Take the moment and make it perfect", sunny),
        Phrase(
            "You are capable of more than you know. Believe in yourself and unleash your true potential",
            sunny
        ),
        Phrase(
            "The harder you work for something, the greater you'll feel when you achieve it",
            sunny
        ),
        Phrase(
            "Success is not about how many times you fall, but about how many times you get back up and keep going",
            sunny
        ),
        Phrase(
            "Difficult roads often lead to beautiful destinations. Keep pushing forward and never give up",
            sunny
        ),
        Phrase(
            "Your time is limited, so don't waste it living someone else's life. Believe in your dreams and make them a reality",
            sunny
        ),
        Phrase(
            "Happiness is not something you postpone for the future; it is something you design for the present",
            happy
        ),
        Phrase(
            "The key to happiness is appreciating what you have while working towards what you want",
            happy
        ),
        Phrase(
            "True happiness comes from within. It is a state of mind that no external circumstance can take away from you",
            happy
        ),
        Phrase(
            "Happiness is not a destination, but a way of life. Embrace the journey and find joy in every moment",
            happy
        ),
        Phrase(
            "Choose happiness every day, even when life gets tough. Your attitude determines your happiness",
            happy
        ),
        Phrase(
            "Happiness is found in the simplest of things: a warm smile, a kind gesture, or a moment of gratitude",
            happy
        ),
        Phrase(
            "Don't rely on others to make you happy. Take responsibility for your own happiness and create a life you love",
            happy
        ),
        Phrase(
            "Happiness is a choice, not a result. Choose to be happy and watch your life transform",
            happy
        ),
        Phrase(
            "Find joy in the little things, for they are the ones that make life truly meaningful and fulfilling",
            happy
        ),
        Phrase(
            "Happiness is contagious. Spread it to others, and you'll find it multiplied within yourself",
            happy
        ),
        Phrase("The only way to do great work is to love what you do.- Steve Jobs", sunny),
        Phrase(
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.- Albert Schweitzer",
            sunny
        ),
        Phrase(
            "The greatest glory in living lies not in never falling, but in rising every time we fall.- Nelson Mandela",
            sunny
        ),
        Phrase(
            "Your time is limited, don't waste it living someone else's life.- Steve Jobs",
            sunny
        ),
        Phrase(
            "The future belongs to those who believe in the beauty of their dreams.- Eleanor Roosevelt",
            sunny
        ),
        Phrase(
            "Success is not final, failure is not fatal: It is the courage to continue that counts.- Winston Churchill",
            happy
        ),
        Phrase("Believe you can and you're halfway there.- Theodore Roosevelt", happy),
        Phrase(
            "The only limit to our realization of tomorrow will be our doubts of today.- Franklin D. Roosevelt",
            happy
        ),
        Phrase(
            "The biggest adventure you can take is to live the life of your dreams.- Oprah Winfrey",
            happy
        ),
        Phrase("The best way to predict the future is to create it.- Peter Drucker", happy),

        )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].description

    }
}