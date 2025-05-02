package za.ac.iie.assignment2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {

    private val questions = arrayOf(
      "The earth is flat.",
    "The Great Wall of China is visible from space.",
    "DNA has a double helical structure  .",
    "The first World War ended in 1918.",
    "RNA has deoxyribose sugar ."
    )

    private val answers = arrayOf(false, false, true, true, false)

    @Test
    fun testAnswersLogic() {
        var score = 0

        // Simulate user answers
        val userAnswers = arrayOf(false, false, true, true, true) // Last one is wrong

        for (i in questions.indices) {
            if (userAnswers[i] == answers[i]) {
                score++
            }
        }

        assertEquals(4, score)
    }

    @Test
    fun testAllCorrectAnswers() {
        val userAnswers = arrayOf(false, false, true, true, false)
        var score = 0

        for (i in userAnswers.indices) {
            if (userAnswers[i] == answers[i]) {
                score++
            }
        }

        assertEquals(5, score)
    }

    @Test
    fun testAllWrongAnswers() {
        val userAnswers = arrayOf(true, true, false, false, true)
        var score = 0

        for (i in userAnswers.indices) {
            if (userAnswers[i] == answers[i]) {
                score++
            }
        }

        assertEquals(0, score)
    }
}
