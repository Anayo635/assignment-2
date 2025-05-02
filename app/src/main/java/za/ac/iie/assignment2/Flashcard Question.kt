package za.ac.iie.assignment2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {

    private val questions = arrayOf(
        "The earth is flat.",
        "The Great Wall of China is visible from space.",
        "DNA has a double helical structure  .",
        "The first World War ended in 1918.",
        "RNA has deoxyribose sugar ."
    )

    private val answers = arrayOf(false, false, true, true, false)
    private var index = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        val questionText = findViewById<TextView>(R.id.textView2)
        val trueButton = findViewById<Button>(R.id.button2)
        val falseButton = findViewById<Button>(R.id.button3)
        val nextButton = findViewById<Button>(R.id.button4)
        val feedbackText = findViewById<TextView>(R.id.textView4 )

        questionText.text = questions[index]

        fun checkAnswer(userAnswer: Boolean) {
            val correct = answers[index]
            if (userAnswer == correct) {
                feedbackText.text = "Correct!"
                score++
            } else {
                feedbackText.text = "Incorrect"
            }
        }

        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }

        nextButton.setOnClickListener {
            index++
            if (index < questions.size) {
                questionText.text = questions[index]
                feedbackText.text = ""
            } else {
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("SCORE", score)
                startActivity(intent)
                finish()
            }
        }
    }
}
