package com.example.motivation

import com.example.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val mListPhrase = listOf<Phrase>(
        Phrase("A qualidade dos seus pensamentos define a qualidade da sua vida.", sunny),
        Phrase("Acredite em si mesmo e todo o resto se encaixará. - Norman Vincent Peale", sunny),
        Phrase("O sucesso é a soma de pequenos esforços repetidos dia após dia. - Robert Collier", sunny),
        Phrase("Não tenha medo de desistir do bom para buscar o ótimo. - John D. Rockefeller", sunny),
        Phrase("Acredite que você pode e você está no meio do caminho. - Theodore Roosevelt", sunny),
        Phrase("Seja a mudança que você deseja ver no mundo. - Mahatma Gandhi", sunny),
        Phrase("Nunca é tarde demais para ser o que você poderia ter sido. - George Eliot", sunny),
        Phrase("A jornada de mil milhas começa com um único passo. - Lao Tzu", sunny),
        Phrase("A persistência é o caminho do êxito. - Charles Chaplin", sunny),
        Phrase("Você é capaz de coisas incríveis quando acredita em si mesmo. - Unknown", sunny),
        Phrase("O otimismo é a fé em ação. - Helen Keller", sunny),
        Phrase("Acredite nos seus sonhos e eles podem se tornar realidade. - Unknown", sunny),
        Phrase("Não espere por oportunidades. Crie-as. - Unknown", happy),
        Phrase("Você é mais forte do que pensa e será mais bem-sucedido do que imagina. - Dale Carnegie", happy),
        Phrase("Acredite em si mesmo, pois até sua sombra o segue. - Unknown", happy),
        Phrase("Não tenha medo de falhar. Tenha medo de não tentar. - Unknown", happy),
        Phrase("A vida é como andar de bicicleta. Para manter o equilíbrio, você deve continuar em movimento. - Albert Einstein", happy),
        Phrase("Você é responsável pelo seu próprio destino. - Unknown", happy),
        Phrase("As oportunidades não surgem. Você as cria. - Chris Grosser", happy),
        Phrase("Grandes coisas nunca vêm de zonas de conforto. - Unknown", happy),
        Phrase("Acredite em si mesmo e tudo é possível. - Unknown", happy)
    )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].description

    }
}