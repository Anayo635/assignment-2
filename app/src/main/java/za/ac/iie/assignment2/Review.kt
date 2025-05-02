package za.ac.iie.assignment2


    import android.os.Bundle
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity

    class ReviewActivity : AppCompatActivity() {


          private val questions = arrayOf(
            "The earth is flat.",
            "The Great Wall of China is visible from space.",
            "DNA has a double helical structure  .",
            "The first World War ended in 1918.",
            "RNA has deoxyribose sugar ."
        )

        private val answers = arrayOf(false, false, true, true, false)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_review)

            val reviewTextView = findViewById<TextView>(R.id.textView5)

            val reviewText = StringBuilder()
            for (i in questions.indices) {
                reviewText.append("Q${i + 1}: ${questions[i]}\n")
                reviewText.append("Correct Answer: ${if (answers[i]) "True" else "False"}\n\n")
            }

            reviewTextView.text = reviewText.toString()
        }
    }
